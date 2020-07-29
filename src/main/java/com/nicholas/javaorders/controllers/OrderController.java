package com.nicholas.javaorders.controllers;


import com.nicholas.javaorders.models.Order;
import com.nicholas.javaorders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/order/{id}", produces = {"application/json"})
    public ResponseEntity<Order> getOrder(@PathVariable long id){
        Order order = orderService.getOrderById(id);

        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
