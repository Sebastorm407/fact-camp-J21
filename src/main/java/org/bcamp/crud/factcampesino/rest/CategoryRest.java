package org.bcamp.crud.factcampesino.rest;


import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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

    @PostMapping
    private ResponseEntity<Category> createCategory(@RequestBody Category category){
        System.out.println("Recibiendo datos: " + category.getName());  // Imprime el valor recibido
        try{
            Category categorySave = categoryService.save(category);
            return ResponseEntity.created(new URI("/category" + categorySave.getId())).body(categorySave);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
