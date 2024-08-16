package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.Supplier;
import org.bcamp.crud.factcampesino.repository.SupplierRepository;
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
public class SupplierService implements SupplierRepository {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Supplier> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Supplier> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Supplier> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Supplier getOne(Long aLong) {
        return null;
    }

    @Override
    public Supplier getById(Long aLong) {
        return null;
    }

    @Override
    public Supplier getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Supplier> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Supplier> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Supplier> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Supplier> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Supplier> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Supplier> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Supplier, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Supplier> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Supplier> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Supplier> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public List<Supplier> findAllById(Iterable<Long> longs) {
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
    public void delete(Supplier entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Supplier> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Supplier> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Supplier> findAll(Pageable pageable) {
        return null;
    }
}
