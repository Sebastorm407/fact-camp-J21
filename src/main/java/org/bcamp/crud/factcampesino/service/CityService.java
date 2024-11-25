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
public class CityService{
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

    public <S extends City> S save(S entity) {
        return cityRepository.save(entity);
    }

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

}
