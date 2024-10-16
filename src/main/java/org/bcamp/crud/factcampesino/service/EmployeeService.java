package org.bcamp.crud.factcampesino.service;

import org.bcamp.crud.factcampesino.model.Employee;
import org.bcamp.crud.factcampesino.repository.EmployeeRepository;
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
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee getById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public Optional<Employee> findBynumberId(Long numberId) {
        return employeeRepository.findById(numberId);
    }


    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
