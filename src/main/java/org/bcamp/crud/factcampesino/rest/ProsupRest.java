package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Product_supply;
import org.bcamp.crud.factcampesino.service.ProsupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prosup")
@CrossOrigin("*")
public class ProsupRest {
    @Autowired
    private ProsupService prosupService;

    @GetMapping
    private ResponseEntity<List<Product_supply>> getAllProsup() {
        return ResponseEntity.ok(prosupService.findAll());
    }
}
