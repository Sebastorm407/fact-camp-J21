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

    @GetMapping("{id}")
    private ResponseEntity<List<City>> getAllDepartById(@PathVariable("id") Long idCity) {
        return ResponseEntity.ok(cityService.findAllByDepart(idCity));
    }
}
