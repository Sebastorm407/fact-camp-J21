package org.bcamp.crud.factcampesino.rest;


import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        categoryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Responder con No Content cuando la eliminación es exitosa
    }

    @PutMapping("/{id}")
    private ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category){
        if(id == null || category.getId() == null || !id.equals(category.getId())){
            return ResponseEntity.badRequest().build();
        }

        Optional<Category> existingProduct = categoryService.findById(id);
        if(!existingProduct.isPresent()){
            return ResponseEntity.notFound().build();
        }

        Category categorySave = categoryService.save(category);
        return ResponseEntity.ok(categorySave);
    }
}
