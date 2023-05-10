package com.SpringBoot.MyString;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    static Customer Save(Customer customer) {
        return null;
    }
}
