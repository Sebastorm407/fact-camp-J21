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
public class ClientService implements ClientRepository{
    //Inyeccion del elemento sin llegar a crear una instancia
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Client> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Client> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Client> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Client getOne(Long aLong) {
        return null;
    }

    @Override
    public Client getById(Long aLong) {
        return null;
    }

    @Override
    public Client getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Client> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Client> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Client> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Client> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Client> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Client> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Client, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Client> S save(S entity) {
        return clientRepository.save(entity);
    }

    @Override
    public <S extends Client> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Client> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        clientRepository.deleteById(aLong);
    }

    @Override
    public void delete(Client entity) {
        clientRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Client> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Client> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Client> findAll(Pageable pageable) {
        return null;
    }
}
