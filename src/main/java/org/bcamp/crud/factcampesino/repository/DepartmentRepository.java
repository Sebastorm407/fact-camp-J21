package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
