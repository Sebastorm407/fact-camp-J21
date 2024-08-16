package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Classification;
import org.bcamp.crud.factcampesino.service.ClassifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classif")
@CrossOrigin("*")
public class ClassifRest {
    @Autowired
    private ClassifService classifService;

    @GetMapping
    private ResponseEntity<List<Classification>> findAll(){
        return ResponseEntity.ok(classifService.findAll());
    }
}
