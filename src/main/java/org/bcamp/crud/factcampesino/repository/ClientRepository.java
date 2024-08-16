package org.bcamp.crud.factcampesino.repository;

import org.bcamp.crud.factcampesino.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    //Los servicios es la implementacion del repositorio
}
