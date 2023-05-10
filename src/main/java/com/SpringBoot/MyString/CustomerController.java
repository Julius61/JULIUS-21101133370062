package com.SpringBoot.MyString;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customer")
@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer customer1 = customerService.createCustomer(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long customerId) {
        Customer customer2 = customerService.getCustomerById(customerId);
        return new ResponseEntity<>(customer2, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> customer3 = customerService.getAllCustomer();
        return new ResponseEntity<>(customer3, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") Long customerId) {
        customer.setId(customerId);
        Customer customer4 = customerService.updateCustomer(customer);
        return new ResponseEntity<>(customer4, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
    }
}
