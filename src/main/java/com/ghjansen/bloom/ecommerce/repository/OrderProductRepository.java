package com.ghjansen.bloom.ecommerce.repository;

import com.ghjansen.bloom.ecommerce.model.OrderProduct;
import com.ghjansen.bloom.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
