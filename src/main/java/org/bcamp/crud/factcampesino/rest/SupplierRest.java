package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Supplier;
import org.bcamp.crud.factcampesino.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@CrossOrigin("*")
public class SupplierRest{
    @Autowired
    private SupplierService supplierService;

    @GetMapping
    private ResponseEntity<List<Supplier>> getAll(){
        return ResponseEntity.ok(supplierService.findAll());
    }
}
