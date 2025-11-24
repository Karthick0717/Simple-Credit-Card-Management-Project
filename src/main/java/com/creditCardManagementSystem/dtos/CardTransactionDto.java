package com.creditCardManagementSystem.dtos;

import com.creditCardManagementSystem.entities.CreditCard;
import com.creditCardManagementSystem.entities.Customer;
import com.creditCardManagementSystem.enums.TransactionType;

import jakarta.validation.constraints.NotNull;

public class CardTransactionDto {
	
	@NotNull (message = " transactionId should not be null")
    private int transactionId;
   	
	
	private Customer customer;
	
	
	private CreditCard creditCard;
	
	@NotNull (message = "merchant name should not be null")
	private String merchantName;
	
	
	private TransactionType type;


	public CardTransactionDto() {
		super();
	}


	public CardTransactionDto(int transactionId, Customer customer, CreditCard creditCard, String merchantName,
			TransactionType type) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.creditCard = creditCard;
		this.merchantName = merchantName;
		this.type = type;
	}


	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public CreditCard getCreditCard() {
		return creditCard;
	}


	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	public String getMerchantName() {
		return merchantName;
	}


	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}


	public TransactionType getType() {
		return type;
	}


	public void setType(TransactionType type) {
		this.type = type;
	}
	
	
	
	
}
