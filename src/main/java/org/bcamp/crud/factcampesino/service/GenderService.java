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
public class GenderService{
    @Autowired
    private GenderRepository genderRepository;

    public Optional<Gender> findById(Long id) {
        return genderRepository.findById(id);
    }

    public List<Gender> findAll() {
        return genderRepository.findAll();
    }
}
