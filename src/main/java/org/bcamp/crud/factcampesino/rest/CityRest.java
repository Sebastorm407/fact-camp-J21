package org.bcamp.crud.factcampesino.rest;


import org.bcamp.crud.factcampesino.model.City;
import org.bcamp.crud.factcampesino.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin("*")
public class CityRest {

    @Autowired
    private CityService cityService;

    @GetMapping
    private ResponseEntity<List<City>> getAll() {
        return ResponseEntity.ok(cityService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) {
        City city = cityService.findById(id)
                .orElseThrow(() -> new RuntimeException("City with ID " + id + " not found"));
        return ResponseEntity.ok(city);
    }
}
