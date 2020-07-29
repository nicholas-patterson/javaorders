package com.nicholas.javaorders.services;

import com.nicholas.javaorders.models.Customer;
import com.nicholas.javaorders.repositories.CustomerRepository;
import org.aspectj.weaver.ArrayReferenceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();

        customerRepository.findAll().iterator().forEachRemaining(customers::add);

        return customers;
    }

    @Override
    public Customer getById(long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Customer with id " + id + " does not exist."));

        return customer;
    }


    @Override
    public List<Customer> getCustomerBySubname(String subname) {

        return customerRepository.findCustomersByCustnameContainingIgnoringCase(subname);

    }
}
