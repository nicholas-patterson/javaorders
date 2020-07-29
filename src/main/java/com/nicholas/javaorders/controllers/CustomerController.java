package com.nicholas.javaorders.controllers;


import com.nicholas.javaorders.models.Customer;
import com.nicholas.javaorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // http://localhost:2019/customers/orders

    @GetMapping(path = "/orders", produces = {"application/json"})
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers = customerService.getAllCustomers();

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    // http://localhostL2019/customers/customer/{id}
    @GetMapping(path = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<Customer> getCustomer(@PathVariable long id){
        Customer customer = customerService.getById(id);

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    // http://localhost:2019/customers/namelike/mes
    @GetMapping(path = "/namelike/{subname}",produces = {"application/json"})
    public ResponseEntity<List<Customer>> getCustomersWithSubname(@PathVariable String subname){
        List<Customer> customers = customerService.getCustomerBySubname(subname);

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}
