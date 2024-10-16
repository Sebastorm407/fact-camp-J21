package org.bcamp.crud.factcampesino.service;


import org.bcamp.crud.factcampesino.model.Bill;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.repository.BillRepository;
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




    public Bill saves(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> findAll() {
        return billRepository.findAll();
    }

}