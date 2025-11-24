package com.creditCardManagementSystem.entities;

import com.creditCardManagementSystem.enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CardTransaction {
	
	@Id
	private int transactionId;
	
	
	private Customer customer;
	
	
	private CreditCard creditCard;
	
	
	private String merchantName;
	
	@Enumerated (EnumType.STRING)
	private TransactionType type;

	public CardTransaction(int transactionId, Customer customer, CreditCard creditCard, String merchantName,
			TransactionType type) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.creditCard = creditCard;
		this.merchantName = merchantName;
		this.type = type;
	}

	public CardTransaction() {
		super();
	}
	
	

}
