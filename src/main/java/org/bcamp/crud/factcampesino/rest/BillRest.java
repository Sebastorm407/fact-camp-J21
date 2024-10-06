package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Bill;
import org.bcamp.crud.factcampesino.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bill")
@CrossOrigin("*")
public class BillRest {
    @Autowired
    private BillService billService;

    @GetMapping
    private ResponseEntity<List<Bill>> getAllState(){
        return ResponseEntity.ok(billService.findAll());
    }
}
