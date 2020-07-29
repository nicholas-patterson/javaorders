package com.nicholas.javaorders.services;


import com.nicholas.javaorders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getById(long id);

    List<Customer> getCustomerBySubname(String subname);

}
