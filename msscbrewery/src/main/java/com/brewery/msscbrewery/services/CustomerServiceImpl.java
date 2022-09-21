package com.brewery.msscbrewery.services;

import com.brewery.msscbrewery.web.model.BeerDto;
import com.brewery.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Test").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, BeerDto customerDto) {
        //TODO
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a beer...");
    }
}
