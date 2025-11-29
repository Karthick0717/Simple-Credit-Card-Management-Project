package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditCardManagementSystem.entities.CardTransaction;

@Repository
public interface CardTransactionRepository extends JpaRepository<CardTransaction, Integer> {

}
