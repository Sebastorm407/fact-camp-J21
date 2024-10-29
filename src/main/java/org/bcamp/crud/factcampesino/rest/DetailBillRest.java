package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.dto.DetailBillDTO;
import org.bcamp.crud.factcampesino.model.*;
import org.bcamp.crud.factcampesino.service.BillService;
import org.bcamp.crud.factcampesino.service.DetailBillService;
import org.bcamp.crud.factcampesino.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/detail-bill")
@CrossOrigin("*")
public class DetailBillRest {
    @Autowired
    private DetailBillService detailBillService;

    @Autowired
    private ProductService productService;

    @Autowired
    private BillService billService;
    @Autowired
    private Gson gson;

    @GetMapping
    private ResponseEntity<List<DetailBill>> getAllState(){
        return ResponseEntity.ok(detailBillService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> createDetailBill(@RequestBody DetailBillDTO detailBillDTO) {
        try{
            Gson gson = new Gson();
            System.out.println("Entro: " + gson.toJson(detailBillDTO));
            DetailBill createdDetail = detailBillService.createDetailBills(detailBillDTO);
            // Llama al servicio para crear el detalle
            return ResponseEntity.status(HttpStatus.CREATED).body(createdDetail);
        } catch (Exception e){
            System.out.println("Error al crear el detalle de la factura: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al crear el detalle de la factura: " + e.getMessage());
        }
    }

}
