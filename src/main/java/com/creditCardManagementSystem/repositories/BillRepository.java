package com.creditCardManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditCardManagementSystem.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
