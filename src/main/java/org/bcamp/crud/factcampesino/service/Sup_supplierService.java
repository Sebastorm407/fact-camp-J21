package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.repository.Sup_supplierRepository;
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
public class Sup_supplierService implements Sup_supplierRepository {
    @Autowired
    private Sup_supplierRepository sup_supplierRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<org.bcamp.crud.factcampesino.model.Sup_supplier> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public org.bcamp.crud.factcampesino.model.Sup_supplier getOne(Long aLong) {
        return null;
    }

    @Override
    public org.bcamp.crud.factcampesino.model.Sup_supplier getById(Long aLong) {
        return null;
    }

    @Override
    public org.bcamp.crud.factcampesino.model.Sup_supplier getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> S save(S entity) {
        return null;
    }

    @Override
    public <S extends org.bcamp.crud.factcampesino.model.Sup_supplier> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<org.bcamp.crud.factcampesino.model.Sup_supplier> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<org.bcamp.crud.factcampesino.model.Sup_supplier> findAll() {
        return sup_supplierRepository.findAll();
    }

    @Override
    public List<org.bcamp.crud.factcampesino.model.Sup_supplier> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(org.bcamp.crud.factcampesino.model.Sup_supplier entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends org.bcamp.crud.factcampesino.model.Sup_supplier> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<org.bcamp.crud.factcampesino.model.Sup_supplier> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<org.bcamp.crud.factcampesino.model.Sup_supplier> findAll(Pageable pageable) {
        return null;
    }
}
