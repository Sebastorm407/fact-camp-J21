package org.bcamp.crud.factcampesino.rest;

import jakarta.persistence.EntityNotFoundException;
import org.bcamp.crud.factcampesino.dto.EmployeeDTO;
import org.bcamp.crud.factcampesino.model.City;
import org.bcamp.crud.factcampesino.model.Client;
import org.bcamp.crud.factcampesino.model.Employee;
import org.bcamp.crud.factcampesino.model.Gender;
import org.bcamp.crud.factcampesino.service.CityService;
import org.bcamp.crud.factcampesino.service.EmployeeService;
import org.bcamp.crud.factcampesino.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeRest {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CityService cityService;

    @Autowired
    private GenderService genderService;

    @GetMapping
    private ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployesById(@PathVariable("id") Long id) {
        Employee employee = employeeService.getById(id);

        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Responder con No Content cuando la eliminación es exitosa
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO dto) {
        City city = cityService.findById(dto.getId_city())
                .orElseThrow(() -> new EntityNotFoundException("City with ID " + dto.getId_city() + " not found"));
        Gender gender = genderService.findById(dto.getId_gender())
                .orElseThrow(() -> new RuntimeException("Gender not found"));

        Employee employee = new Employee();
        employee.setNumberId(dto.getNumber_id());
        employee.setPassword_id(dto.getPassword_id());
        employee.setName(dto.getName());
        employee.setLast_name(dto.getLast_name());
        employee.setBirthdate(dto.getBirthdate());
        employee.setAddress(dto.getAddress());
        employee.setPhone_number(dto.getPhone_number());
        employee.setCity(city);
        employee.setGender(gender);

        Employee savedEmployee = employeeService.save(employee);
        return ResponseEntity.ok(savedEmployee);
    }

}
