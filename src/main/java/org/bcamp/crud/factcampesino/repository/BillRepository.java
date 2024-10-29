package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    Bill findTopByOrderByIdDesc(); // Este método obtiene la última factura por ID
}