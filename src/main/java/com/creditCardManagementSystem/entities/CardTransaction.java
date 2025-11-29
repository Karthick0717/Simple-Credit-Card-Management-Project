package com.creditCardManagementSystem.entities;

import com.creditCardManagementSystem.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class CardTransaction {
	
	@Id
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name = "customer_id",nullable=false)
	@JsonBackReference (value = "customer-cardtransaction")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "card_id",nullable=false)
	@JsonBackReference(value = "creditcard-cardtransaction")
	private CreditCard creditCard;
	
	private String merchantName;
	
	@Enumerated (EnumType.STRING)
	private TransactionType type;
	
	private double amount;

	public CardTransaction() {
		super();
	}

	public CardTransaction(int transactionId, Customer customer, CreditCard creditCard, String merchantName,
			TransactionType type, double amount) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.creditCard = creditCard;
		this.merchantName = merchantName;
		this.type = type;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
