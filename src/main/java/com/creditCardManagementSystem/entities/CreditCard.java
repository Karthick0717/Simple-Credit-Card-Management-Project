package com.creditCardManagementSystem.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class CreditCard {
	
	@Id
	private int creditCardId;
	
	@ManyToOne
	@JoinColumn (name= "customer_id",nullable = false)
	@JsonBackReference (value = "customer-creditcard")
	private Customer customer;  // 
	
	private double creditLimit;
	
	private double availableLimit;
	
	private String cardNumber;
	
	private double interestRate;
	
	private LocalDateTime createdAt;

	@OneToMany (mappedBy = "creditCard")
	@JsonManagedReference  (value = "creditcard-cardtransaction")
	private List<CardTransaction> listOfCardTransactions;
	
	@OneToMany (mappedBy = "creditCard")
	@JsonManagedReference(value = "creditcard-payments")
	private List<Payment> listOfPayments;
	
	@OneToMany (mappedBy = "creditCard")
	@JsonManagedReference (value = "creditcard-bill")
	private List<Bill> listOfBills;

	public CreditCard() {
		super();
	}

	public CreditCard(int creditCardId, Customer customer, double creditLimit, double availableLimit, String cardNumber,
			double interestRate, LocalDateTime createdAt, List<CardTransaction> listOfCardTransactions,
			List<Payment> listOfPayments) {
		super();
		this.creditCardId = creditCardId;
		this.customer = customer;
		this.creditLimit = creditLimit;
		this.availableLimit = availableLimit;
		this.cardNumber = cardNumber;
		this.interestRate = interestRate;
		this.createdAt = createdAt;
		this.listOfCardTransactions = listOfCardTransactions;
		this.listOfPayments = listOfPayments;
	}

	public int getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getAvailableLimit() {
		return availableLimit;
	}

	public void setAvailableLimit(double availableLimit) {
		this.availableLimit = availableLimit;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<CardTransaction> getListOfCardTransactions() {
		return listOfCardTransactions;
	}

	public void setListOfCardTransactions(List<CardTransaction> listOfCardTransactions) {
		this.listOfCardTransactions = listOfCardTransactions;
	}

	public List<Payment> getListOfPayments() {
		return listOfPayments;
	}

	public void setListOfPayments(List<Payment> listOfPayments) {
		this.listOfPayments = listOfPayments;
	}

}
