package org.bcamp.crud.factcampesino.service;

import jakarta.persistence.EntityNotFoundException;
import org.bcamp.crud.factcampesino.model.Product;
import org.bcamp.crud.factcampesino.repository.ProductRepository;
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
public class ProductService{
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public boolean existsById(Long aLong) {
        return false;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> update(Long id, Product product) {
        return productRepository.findById(id).map(existingProduct -> {
            existingProduct.setName(product.getName());
            existingProduct.setSell_price(product.getSell_price());
            return productRepository.save(existingProduct);
        });
    }


    public void deleteById(Long id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
        } else{
            throw new EntityNotFoundException("Product with id " + id + " not found");
        }
    }

}
