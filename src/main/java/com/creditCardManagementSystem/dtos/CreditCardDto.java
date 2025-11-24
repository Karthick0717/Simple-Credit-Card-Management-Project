package com.creditCardManagementSystem.dtos;

import java.time.LocalDateTime;

import com.creditCardManagementSystem.entities.Customer;

public class CreditCardDto {

    private int creditCardId;
	
	private Customer customer;
	
	private double creditLimit;
	
	private double availableLimit;
	
	private String cardNumber;
	
	private double interestRate;
	
	private LocalDateTime createdAt;

	public CreditCardDto() {
		super();
	}

	public CreditCardDto(int creditCardId, Customer customer, double creditLimit, double availableLimit,
			String cardNumber, double interestRate, LocalDateTime createdAt) {
		super();
		this.creditCardId = creditCardId;
		this.customer = customer;
		this.creditLimit = creditLimit;
		this.availableLimit = availableLimit;
		this.cardNumber = cardNumber;
		this.interestRate = interestRate;
		this.createdAt = createdAt;
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
	
	
}
