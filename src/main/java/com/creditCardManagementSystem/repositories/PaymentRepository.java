package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditCardManagementSystem.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
