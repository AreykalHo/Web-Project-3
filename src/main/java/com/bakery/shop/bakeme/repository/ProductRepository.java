package com.bakery.shop.bakeme.repository;

import org.springframework.data.repository.CrudRepository;

import com.bakery.shop.bakeme.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}