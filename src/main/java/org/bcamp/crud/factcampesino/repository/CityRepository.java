package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
