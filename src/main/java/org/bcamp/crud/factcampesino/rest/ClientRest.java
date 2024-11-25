package org.bcamp.crud.factcampesino.rest;

import jakarta.persistence.EntityNotFoundException;
import org.bcamp.crud.factcampesino.dto.EmployeeDTO;
import org.bcamp.crud.factcampesino.model.City;
import org.bcamp.crud.factcampesino.model.Client;
import org.bcamp.crud.factcampesino.model.Employee;
import org.bcamp.crud.factcampesino.model.Gender;
import org.bcamp.crud.factcampesino.service.CityService;
import org.bcamp.crud.factcampesino.service.ClientService;
import org.bcamp.crud.factcampesino.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientRest {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CityService cityService;

    @Autowired
    private GenderService genderService;

    @GetMapping
    private ResponseEntity<List<Client>> getAllClient(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping
    public ResponseEntity<Client> createEmployee(@RequestBody EmployeeDTO dto) {
        City city = cityService.findById(dto.getId_city())
                .orElseThrow(() -> new EntityNotFoundException("City with ID " + dto.getId_city() + " not found"));
        Gender gender = genderService.findById(dto.getId_gender())
                .orElseThrow(() -> new RuntimeException("Gender not found"));

        Client client = new Client();
        client.setNumber_id(dto.getNumber_id());
        client.setName(dto.getName());
        client.setLast_name(dto.getLast_name());
        client.setBirthdate(dto.getBirthdate());
        client.setAddress(dto.getAddress());
        client.setPhone_number(dto.getPhone_number());
        client.setCity(city);
        client.setGender(gender);

        Client savedClient = clientService.save(client);
        return ResponseEntity.ok(savedClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteClient(@PathVariable Long id) {
        try {
            clientService.deleteById(id);
            // Crear un mensaje de éxito
            Map<String, String> response = new HashMap<>();
            response.put("message", "Cliente eliminado con éxito");
            return ResponseEntity.ok(response);
        } catch (IllegalStateException e) {
            // Manejar una excepción personalizada para relaciones bloqueadas
            Map<String, String> response = new HashMap<>();
            response.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        } catch (Exception e) {
            // Manejar errores genéricos
            Map<String, String> response = new HashMap<>();
            response.put("message", "Error al eliminar el cliente");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

}
