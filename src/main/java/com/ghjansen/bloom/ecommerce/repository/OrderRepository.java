package com.ghjansen.bloom.ecommerce.repository;

import com.ghjansen.bloom.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
