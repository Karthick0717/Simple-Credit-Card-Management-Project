package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditCardManagementSystem.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
