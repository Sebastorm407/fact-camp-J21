package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Country;
import org.bcamp.crud.factcampesino.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin("*")
public class CountryRest {
    @Autowired
    private CountryService countryService;

    @GetMapping
    private ResponseEntity<List<Country>> getAll() {
        return ResponseEntity.ok(countryService.findAll());
    }
}
