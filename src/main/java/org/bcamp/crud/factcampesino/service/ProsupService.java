package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.Product_supply;
import org.bcamp.crud.factcampesino.repository.ProsupRepository;
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
public class ProsupService implements ProsupRepository {
    @Autowired
    private ProsupRepository prosupRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Product_supply> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Product_supply> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Product_supply> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Product_supply getOne(Long aLong) {
        return null;
    }

    @Override
    public Product_supply getById(Long aLong) {
        return null;
    }

    @Override
    public Product_supply getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Product_supply> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Product_supply> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Product_supply> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Product_supply> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Product_supply> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Product_supply> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Product_supply, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Product_supply> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Product_supply> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Product_supply> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Product_supply> findAll() {
        return prosupRepository.findAll();
    }

    @Override
    public List<Product_supply> findAllById(Iterable<Long> longs) {
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
    public void delete(Product_supply entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Product_supply> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Product_supply> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Product_supply> findAll(Pageable pageable) {
        return null;
    }
}
