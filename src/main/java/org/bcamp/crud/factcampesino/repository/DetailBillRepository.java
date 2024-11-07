package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.DetailBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailBillRepository extends JpaRepository<DetailBill, Long> {
    @Query("SELECT d FROM DetailBill d WHERE d.id_bill.id = :billId")
    List<DetailBill> findByBillId(@Param("billId") Long billId);
}
