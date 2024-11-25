package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.Gender;
import org.bcamp.crud.factcampesino.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderRest {
    @Autowired
    private GenderService genderService;

    @GetMapping
    public ResponseEntity<List<Gender>> getAll() {
        return ResponseEntity.ok(genderService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gender> getGenderById(@PathVariable Long id) {
        Gender gender = genderService.findById(id)
                .orElseThrow(() -> new RuntimeException("Gender with ID " + id + " not found"));
        return ResponseEntity.ok(gender);
    }
}
