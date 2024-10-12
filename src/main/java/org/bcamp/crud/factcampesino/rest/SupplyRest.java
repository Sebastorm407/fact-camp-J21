package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.dto.SupplyDTO;
import org.bcamp.crud.factcampesino.exceptions.CannotDeleteProductException;
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
import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<Supply> updateSupply(@PathVariable Long id, @RequestBody Supply supply) {
        // Verifica que el ID del suministro no sea nulo
        if (id == null || supply.getId() == null) {
            return ResponseEntity.badRequest().build(); // Devuelve un 400 si hay un ID nulo
        }

        // Aquí deberías tener la lógica para buscar y actualizar el suministro
        Optional<Supply> existingSupplyOpt = supplyService.findById(id);

        if (!existingSupplyOpt.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Supply existingSupply = existingSupplyOpt.get(); // Obtiene el suministro existente

        // Actualiza los valores
        existingSupply.setName(supply.getName());
        existingSupply.setBuyPrice(supply.getBuyPrice());
        existingSupply.setCategory(supply.getCategory()); // Asegúrate de que la categoría sea válida

        Supply updatedSupply = supplyService.save(existingSupply);
        return ResponseEntity.ok(updatedSupply);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        try{
            supplyService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (CannotDeleteProductException e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
