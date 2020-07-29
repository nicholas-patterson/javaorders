package com.nicholas.javaorders.services;


import com.nicholas.javaorders.models.Order;
import com.nicholas.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOrderById(long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());

        return order;
    }
}
