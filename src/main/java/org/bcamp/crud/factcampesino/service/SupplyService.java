package org.bcamp.crud.factcampesino.service;

import jakarta.persistence.EntityNotFoundException;
import org.bcamp.crud.factcampesino.dto.SupplyDTO;
import org.bcamp.crud.factcampesino.exceptions.CannotDeleteProductException;
import org.bcamp.crud.factcampesino.model.Category;
import org.bcamp.crud.factcampesino.model.Supply;
import org.bcamp.crud.factcampesino.repository.CategoryRepository;
import org.bcamp.crud.factcampesino.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
public class SupplyService implements SupplyRepository {

    @Autowired
    private SupplyRepository supplyRepository;

    @Autowired
    private CategoryService categoryService;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Supply> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Supply> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Supply> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Supply getOne(Long aLong) {
        return null;
    }

    @Override
    public Supply getById(Long aLong) {
        return null;
    }

    @Override
    public Supply getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Supply> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Supply> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Supply> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Supply> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Supply> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Supply> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Supply, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Supply save(Supply supply) {
        return supplyRepository.save(supply);
    }

    @Override
    public <S extends Supply> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Supply> findById(Long id) {
        return supplyRepository.findById(id); // Devuelve un Optional<Supply>
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    public Optional<Supply> update(Long id, SupplyDTO supplyDTO) {
        return supplyRepository.findById(id).map(existingSupply -> {
            // Actualiza los campos del objeto existente
            existingSupply.setName(supplyDTO.getName());
            existingSupply.setBuyPrice(supplyDTO.getBuy_price());

            // Actualiza la categoría
            Category category = categoryService.findById(supplyDTO.getId_category())
                    .orElseThrow(() -> new IllegalArgumentException("Categoría no encontrada"));
            existingSupply.setCategory(category);

            // Guarda y devuelve el suministro actualizado
            return supplyRepository.save(existingSupply); // Usamos save aquí para actualizar
        });
    }

    @Override
    public List<Supply> findAll() {
        return supplyRepository.findAll();
    }

    @Override
    public List<Supply> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
            try {
                supplyRepository.deleteById(id);
            } catch (DataIntegrityViolationException e) {
                // Lanzar una excepción personalizada
                throw new CannotDeleteProductException("No se puede eliminar el producto porque está asociado a otra entidad.");
            }
    }

    @Override
    public void delete(Supply entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Supply> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Supply> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Supply> findAll(Pageable pageable) {
        return null;
    }
}
