package com.nicholas.javaorders.repositories;

import com.nicholas.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findCustomersByCustnameContainingIgnoringCase(String subname);


}
