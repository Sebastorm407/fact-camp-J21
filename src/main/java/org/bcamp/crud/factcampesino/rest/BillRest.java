package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.dto.BillDTO;
import org.bcamp.crud.factcampesino.model.*;
import org.bcamp.crud.factcampesino.repository.BillRepository;
import org.bcamp.crud.factcampesino.service.BillService;
import org.bcamp.crud.factcampesino.service.ClientService;
import org.bcamp.crud.factcampesino.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
@CrossOrigin("*")
public class BillRest {
    @Autowired
    private BillService billService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ClientService clientService;
    @Qualifier("billRepository")
    @Autowired
    private BillRepository billRepository;

    @GetMapping
    private ResponseEntity<List<Bill>> getAll(){
        return ResponseEntity.ok(billService.findAll());
    }

    @PostMapping
    private Bill createBill(@RequestBody BillDTO billDTO){
        System.out.println("Entro: " + billDTO);

        Client clientC = clientService.findById(billDTO.getId_client());
        Employee employeeC = employeeService.findById(billDTO.getId_employee());

        Bill bill = new Bill();
        bill.setMake_date(billDTO.getMake_date());
        bill.setClient(clientC);
        bill.setEmployee(employeeC);

        return billRepository.save(bill);
    }

}
