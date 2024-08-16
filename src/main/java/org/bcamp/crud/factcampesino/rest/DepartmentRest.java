package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.model.City;
import org.bcamp.crud.factcampesino.model.Department;
import org.bcamp.crud.factcampesino.service.CityService;
import org.bcamp.crud.factcampesino.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin("*")
public class DepartmentRest {

    @Autowired
    private DepartmentService departmentService;
    private CityService cityService;

    @GetMapping
    private ResponseEntity<List<Department>> getAll() {
        return ResponseEntity.ok(departmentService.findAll());
    }


}
