package com.bakery.shop.bakeme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakery.shop.bakeme.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}