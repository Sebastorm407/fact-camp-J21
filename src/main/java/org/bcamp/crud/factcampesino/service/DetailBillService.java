package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.DetailBill;
import org.bcamp.crud.factcampesino.repository.DetailBillRepository;
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
public class DetailBillService implements DetailBillRepository {
    @Autowired
    private DetailBillRepository detailBillRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends DetailBill> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DetailBill> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<DetailBill> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public DetailBill getOne(Long aLong) {
        return null;
    }

    @Override
    public DetailBill getById(Long aLong) {
        return null;
    }

    @Override
    public DetailBill getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends DetailBill> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DetailBill> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends DetailBill> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends DetailBill> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DetailBill> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DetailBill> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends DetailBill, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends DetailBill> S save(S entity) {
        return null;
    }

    @Override
    public <S extends DetailBill> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<DetailBill> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<DetailBill> findAll() {
        return detailBillRepository.findAll();
    }

    @Override
    public List<DetailBill> findAllById(Iterable<Long> longs) {
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
    public void delete(DetailBill entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends DetailBill> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<DetailBill> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<DetailBill> findAll(Pageable pageable) {
        return null;
    }
}
