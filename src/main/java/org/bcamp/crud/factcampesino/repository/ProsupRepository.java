package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Product_supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProsupRepository extends JpaRepository<Product_supply, Long> {
}
