package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.Client;
import org.bcamp.crud.factcampesino.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ClientService{
    //Inyeccion del elemento sin llegar a crear una instancia
    @Autowired
    private ClientRepository clientRepository;


    public <S extends Client> S save(S entity) {
        return clientRepository.save(entity);
    }

    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public void deleteById(Long aLong) {
        clientRepository.deleteById(aLong);
    }


    public void delete(Client entity) {
        clientRepository.delete(entity);
    }




}
