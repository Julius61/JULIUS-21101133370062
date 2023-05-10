package com.SpringBoot.MyString;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomerById(Long CustomerId);

    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long customerId);

    List<Customer> getAllCustomer();
}
