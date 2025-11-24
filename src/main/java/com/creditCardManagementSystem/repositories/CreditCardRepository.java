package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditCardManagementSystem.entities.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

}
