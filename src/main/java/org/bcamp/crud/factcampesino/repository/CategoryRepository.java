package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
