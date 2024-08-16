package org.bcamp.crud.factcampesino.rest;


import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryRest{
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }
}
