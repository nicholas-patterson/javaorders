package com.nicholas.javaorders.services;


import com.nicholas.javaorders.models.Order;

public interface OrderService {
    Order getOrderById(long id);
}
