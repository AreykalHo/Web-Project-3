package com.bakery.shop.bakeme.service;

import org.springframework.stereotype.Service;

import com.bakery.shop.bakeme.model.Product;
import com.bakery.shop.bakeme.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
}