package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<Supply, Long> {
}
