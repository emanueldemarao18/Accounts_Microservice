package com.emanuel.accounts.mappers;

import com.emanuel.accounts.dto.CustomerDto;
import com.emanuel.accounts.entities.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setEmail(customer.getEmail());
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer matToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setEmail(customer.getEmail());
        customer.setName(customer.getName());
        customer.setMobileNumber(customer.getMobileNumber());
        return customer;
    }
}
