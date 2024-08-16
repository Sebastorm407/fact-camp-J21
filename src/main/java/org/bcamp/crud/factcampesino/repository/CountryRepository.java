package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
