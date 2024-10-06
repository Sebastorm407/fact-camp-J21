package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.dto.SupplyDTO;
import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.model.Supply;
import org.bcamp.crud.factcampesino.service.CategoryService;
import org.bcamp.crud.factcampesino.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/supply")
@CrossOrigin("*")
public class SupplyRest {
    @Autowired
    private SupplyService supplyService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private ResponseEntity<List<Supply>> getAll(){
        return ResponseEntity.ok(supplyService.findAll());
    }

    @PostMapping
    public ResponseEntity<Supply> save(@RequestBody SupplyDTO supplyDTO) {
        try {
            // Aquí usas el supplyDTO en lugar de la entidad Supply
            Category category = categoryService.findById(supplyDTO.getId_category())
                    .orElseThrow(() -> new IllegalArgumentException("Categoría no encontrada"));

            Supply supply = new Supply();
            supply.setName(supplyDTO.getName());
            supply.setBuyPrice(supplyDTO.getBuy_price());
            supply.setCategory(category);

            Supply savedSupply = supplyService.save(supply);
            return new ResponseEntity<>(savedSupply, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("Error al crear el insumo: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
