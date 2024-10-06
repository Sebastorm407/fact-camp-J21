package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/all")
    private List<Product> getAllProduct(){
        return productService.findAll();
    }

    // Endpoint para crear un producto
    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        try {
            // Suponiendo que tienes un servicio que guarda el producto
            Product savedProduct = productService.save(product);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } catch (Exception e) {
            // Registra el error y retorna un código 500
            System.out.println("Error al crear el producto: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return this.productService.findById(id);
    }
}
