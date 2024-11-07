package org.bcamp.crud.factcampesino.rest;

import org.bcamp.crud.factcampesino.dto.BillDTO;
import org.bcamp.crud.factcampesino.model.*;
import org.bcamp.crud.factcampesino.repository.BillRepository;
import org.bcamp.crud.factcampesino.repository.DetailBillRepository;
import org.bcamp.crud.factcampesino.service.BillService;
import org.bcamp.crud.factcampesino.service.ClientService;
import org.bcamp.crud.factcampesino.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private DetailBillRepository detailBillRepository;

    @GetMapping
    private ResponseEntity<List<Bill>> getAll(){
        return ResponseEntity.ok(billService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillDTO> obtainBillWithDetails(@PathVariable Long id){
        BillDTO billDTO = billService.obtainBillWithDetails(id);
        return ResponseEntity.ok(billDTO);
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
