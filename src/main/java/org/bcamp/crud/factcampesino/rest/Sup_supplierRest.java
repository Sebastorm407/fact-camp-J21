package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Sup_supplier;
import org.bcamp.crud.factcampesino.service.Sup_supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sup-supplier")
public class Sup_supplierRest {
    @Autowired
    private Sup_supplierService sup_supplierService;

    @GetMapping
    private ResponseEntity<List<Sup_supplier>> findAll(){
        return ResponseEntity.ok(sup_supplierService.findAll());
    }
}
