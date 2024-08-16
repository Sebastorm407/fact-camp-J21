package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductRest {
    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.findAll());
    }
}
