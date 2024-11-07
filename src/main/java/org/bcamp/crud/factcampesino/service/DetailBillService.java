package org.bcamp.crud.factcampesino.service;

import com.google.gson.Gson;
import org.bcamp.crud.factcampesino.dto.DetailBillDTO;
import org.bcamp.crud.factcampesino.model.Bill;
import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.model.DetailBill;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.repository.DetailBillRepository;
import org.bcamp.crud.factcampesino.rest.DetailBillRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DetailBillService {
    @Autowired
    private DetailBillRepository detailBillRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private BillService billService;

    public DetailBill save(DetailBill detailBill) {
        return detailBillRepository.save(detailBill);
    }

    public List<DetailBill> findAll() {
        return detailBillRepository.findAll();
    }

    public Optional<DetailBill> findById(Long id) {
        return detailBillRepository.findById(id);
    }

    public DetailBill createDetailBills(DetailBillDTO detailBillDTO) {

        System.out.println("Creando detalle de factura con datos" + detailBillDTO);
        // Busca la factura asociada y maneja la excepción si no se encuentra
        Bill bill = billService.findById(detailBillDTO.getId_bill())
                .orElseThrow(() -> new RuntimeException("Factura no encontrada con ID: " + detailBillDTO.getId_bill()));

        // Busca el producto asociado y maneja la excepción si no se encuentra
        Product product = productService.findById(detailBillDTO.getId_product())
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + detailBillDTO.getId_product()));

        // Crea el detalle de la factura
        DetailBill detailBill = new DetailBill();
        detailBill.setAmount(detailBillDTO.getAmount());
        detailBill.setUnit_price(detailBillDTO.getUnit_price());
        detailBill.setId_product(product);
        detailBill.setId_bill(bill);

        // Guarda el detalle y devuelve la entidad creada
        DetailBill savedDetail = detailBillRepository.save(detailBill);
        System.out.println("Detalle de factura creado exitosamente: " + savedDetail);

        return savedDetail;
    }

    public List<DetailBill> obtainDetailsByBillId(Long billId) {
        return detailBillRepository.findByBillId(billId);
    }
}
