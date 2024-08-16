package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.Gender;
import org.bcamp.crud.factcampesino.repository.GenderRepository;
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
public class GenderService implements GenderRepository {
    @Autowired
    private GenderRepository genderRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Gender> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Gender> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Gender> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Gender getOne(Long aLong) {
        return null;
    }

    @Override
    public Gender getById(Long aLong) {
        return null;
    }

    @Override
    public Gender getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Gender> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Gender> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Gender> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Gender> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Gender> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Gender> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Gender, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Gender> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Gender> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Gender> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public List<Gender> findAllById(Iterable<Long> longs) {
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
    public void delete(Gender entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Gender> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Gender> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Gender> findAll(Pageable pageable) {
        return null;
    }
}
