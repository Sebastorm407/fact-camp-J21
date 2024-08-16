package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Employee;
import org.bcamp.crud.factcampesino.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeRest {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    private ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }
}
