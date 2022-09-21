package com.brewery.msscbrewery.services;

import com.brewery.msscbrewery.web.model.BeerDto;
import com.brewery.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, BeerDto customerDto);

    void deleteById(UUID customerId);
}
