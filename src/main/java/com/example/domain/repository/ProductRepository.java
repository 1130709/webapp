package com.example.domain.repository;

/**
 * Created by User on 2016-06-04.
 */

import org.springframework.data.repository.CrudRepository;
import com.example.domain.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}