package com.example.crud1object.service;

import com.example.crud1object.entity.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findProductById(long id);

    Product save(Product product);

    void deleteById(long id);
}
