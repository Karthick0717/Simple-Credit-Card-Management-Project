package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditCardManagementSystem.entities.CardTransaction;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Integer> {

}
