package com.ghjansen.bloom.ecommerce.repository;

import com.ghjansen.bloom.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
