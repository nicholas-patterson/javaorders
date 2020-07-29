package com.nicholas.javaorders.repositories;

import com.nicholas.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
