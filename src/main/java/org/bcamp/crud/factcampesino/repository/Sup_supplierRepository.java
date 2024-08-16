package org.bcamp.crud.factcampesino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sup_supplierRepository extends JpaRepository<org.bcamp.crud.factcampesino.model.Sup_supplier, Long> {
}
