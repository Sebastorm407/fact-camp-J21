package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Supply;
import org.bcamp.crud.factcampesino.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supply")
@CrossOrigin("*")
public class SupplyRest {
    @Autowired
    private SupplyService supplyService;

    @GetMapping
    private ResponseEntity<List<Supply>> getAll(){
        return ResponseEntity.ok(supplyService.findAll());
    }
}
