package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassifRepository extends JpaRepository<Classification, Long> {
}
