package com.example.domain.service;

import com.example.domain.model.Product;

/**
 * Service for product
 */


public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}