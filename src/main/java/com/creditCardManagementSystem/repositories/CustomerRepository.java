package com.creditCardManagementSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.entities.CardTransaction;
import com.creditCardManagementSystem.entities.CreditCard;
import com.creditCardManagementSystem.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	   @Query("select c from Customer c where c.customerId = :id")
	  Customer findCustomerBasicDetails(@Param("id") int id); 
		
	
      @Query ("select cc from CreditCard cc  where cc.customer.customerId=:id")	
      List<CreditCard> findCreditCardsByCustomer(@Param ("id") int id);
	
     @Query ("select t from CardTransaction t where t.customer.customerId=:id")
    List<CardTransaction> findCardTransactionsByCustomer (@Param ("id") int id);

}
