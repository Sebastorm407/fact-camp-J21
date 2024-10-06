package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.DetailBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailBillRepository extends JpaRepository<DetailBill, Long> {
}
