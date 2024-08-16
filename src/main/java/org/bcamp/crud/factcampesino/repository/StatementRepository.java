package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Statement_client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement_client, Long> {

}