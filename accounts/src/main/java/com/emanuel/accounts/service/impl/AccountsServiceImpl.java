package com.emanuel.accounts.service.impl;

import com.emanuel.accounts.dto.CustomerDto;
import com.emanuel.accounts.entities.Customer;
import com.emanuel.accounts.mappers.CustomerMapper;
import com.emanuel.accounts.repository.AccountsRepository;
import com.emanuel.accounts.repository.CustomerRepository;
import com.emanuel.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;

    private CustomerRepository customerRepository;

    /**
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.matToCustomer(customerDto, new Customer());

    }
}
