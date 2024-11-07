package org.bcamp.crud.factcampesino.service;


import org.bcamp.crud.factcampesino.dto.BillDTO;
import org.bcamp.crud.factcampesino.model.Bill;
import org.bcamp.crud.factcampesino.model.DetailBill;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.repository.BillRepository;
import org.bcamp.crud.factcampesino.repository.DetailBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BillService{
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private DetailBillRepository detailBillRepository;



    public Bill saves(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    public Optional<Bill> findById(Long id) {
        return billRepository.findById(id);
    }

    public Bill findLastCreatedBill() {
        return billRepository.findTopByOrderByIdDesc(); // Suponiendo que tienes un método en el repositorio
    }

    public BillDTO obtainBillWithDetails(Long billId){
        Bill bill = billRepository.findById(billId).orElseThrow(() -> new RuntimeException("Factura no encontrada"));
        List<DetailBill> details = detailBillRepository.findByBillId(billId);

        BillDTO billDTO = new BillDTO();
        billDTO.setId(bill.getId());
        billDTO.setMake_date(bill.getMake_date());
        billDTO.setId_client(bill.getClient().getId());
        billDTO.setId_employee(bill.getEmployee().getId());
        billDTO.setDetails(details);
        return billDTO;
    }

}