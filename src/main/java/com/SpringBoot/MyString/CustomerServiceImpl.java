package com.SpringBoot.MyString;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return CustomerRepository.Save(customer);
    }

    @Override
    public Customer getCustomerById(Long CustomerId) {
        Optional<Customer> optionalCustomer=customerRepository.findById(CustomerId);
        return optionalCustomer.get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer myCustomer=customerRepository.findById(customer.getId()).get();
        myCustomer.setName(Customer.getName());
        Object Customer;
        myCustomer.setId(customer.getId());
        Customer updatedCustomer=customerRepository.save(customer);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }
}
