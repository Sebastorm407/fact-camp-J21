package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.DetailBill;
import org.bcamp.crud.factcampesino.service.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detailBill")
@CrossOrigin("*")
public class DetailBillRest {
    @Autowired
    private DetailBillService detailBillService;

    @GetMapping
    private ResponseEntity<List<DetailBill>> getAllState(){
        return ResponseEntity.ok(detailBillService.findAll());
    }
}
