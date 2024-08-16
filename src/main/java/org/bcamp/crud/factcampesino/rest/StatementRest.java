package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Statement_client;
import org.bcamp.crud.factcampesino.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statement")
@CrossOrigin("*")
public class StatementRest {
    @Autowired
    private StatementService statementService;

    @GetMapping
    private ResponseEntity<List<Statement_client>> getAllState(){
        return ResponseEntity.ok(statementService.findAll());
    }
}
