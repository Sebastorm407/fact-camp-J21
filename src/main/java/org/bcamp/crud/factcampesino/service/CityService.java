package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.City;
import org.bcamp.crud.factcampesino.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CityService implements CityRepository {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findAllByDepart(Long id){
        List<City> resCity = new ArrayList<>();
        List<City> cities = cityRepository.findAll();
        for(int i =0; i < cities.size(); i++){
            if(cities.get(i).getDepartment().getId() == id){
                resCity.add(cities.get(i));
            }
        }
        return resCity;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends City> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends City> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<City> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public City getOne(Long aLong) {
        return null;
    }

    @Override
    public City getById(Long aLong) {
        return null;
    }

    @Override
    public City getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends City> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends City> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends City> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends City> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends City> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends City> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends City, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends City> S save(S entity) {
        return cityRepository.save(entity);
    }

    @Override
    public <S extends City> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<City> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<City> findAllById(Iterable<Long> longs) {
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
    public void delete(City entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends City> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<City> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<City> findAll(Pageable pageable) {
        return null;
    }
}
