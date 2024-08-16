package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Gender;
import org.bcamp.crud.factcampesino.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderRest {
    @Autowired
    private GenderService genderService;

    @GetMapping
    private ResponseEntity<List<Gender>> getAll() {
        return ResponseEntity.ok(genderService.findAll());
    }
}
