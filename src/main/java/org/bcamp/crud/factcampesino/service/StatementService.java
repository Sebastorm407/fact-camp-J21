package org.bcamp.crud.factcampesino.service;


import org.bcamp.crud.factcampesino.model.Statement_client;
import org.bcamp.crud.factcampesino.repository.StatementRepository;
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
public class StatementService implements StatementRepository {
    @Autowired
    private StatementRepository statementRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Statement_client> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Statement_client> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Statement_client> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Statement_client getOne(Long aLong) {
        return null;
    }

    @Override
    public Statement_client getById(Long aLong) {
        return null;
    }

    @Override
    public Statement_client getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Statement_client> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Statement_client> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Statement_client> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Statement_client> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Statement_client> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Statement_client> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Statement_client, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Statement_client> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Statement_client> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Statement_client> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Statement_client> findAll() {
        return statementRepository.findAll();
    }

    @Override
    public List<Statement_client> findAllById(Iterable<Long> longs) {
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
    public void delete(Statement_client entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Statement_client> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Statement_client> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Statement_client> findAll(Pageable pageable) {
        return null;
    }
}