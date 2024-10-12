package org.bcamp.crud.factcampesino.service;

import jakarta.persistence.EntityNotFoundException;
import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.model.Supply;
import org.bcamp.crud.factcampesino.repository.CategoryRepository;
import org.bcamp.crud.factcampesino.repository.SupplyRepository;
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
public class CategoryService implements CategoryRepository {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SupplyRepository supplyRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Category> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Category> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Category getOne(Long aLong) {
        return null;
    }

    @Override
    public Category getById(Long aLong) {
        return null;
    }

    @Override
    public Category getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Category> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Category> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Category> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Category, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public <S extends Category> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        if(categoryRepository.existsById(id)){
            categoryRepository.deleteById(id);
        } else{
            throw new EntityNotFoundException("Product with id " + id + " not found");
        }
    }

    @Override
    public void delete(Category entity) {

    }

    public Optional<Category> updateCategory(Long id, Category category) {
        return categoryRepository.findById(id).map(existingProduct -> {
            existingProduct.setName(category.getName());
            return categoryRepository.save(existingProduct);
        });
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Category> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Category> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return null;
    }

}
