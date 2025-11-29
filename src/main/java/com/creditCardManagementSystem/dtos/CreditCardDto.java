package com.creditCardManagementSystem.dtos;

import java.time.LocalDateTime;

import com.creditCardManagementSystem.entities.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CreditCardDto {

    private int creditCardId;
	
    @JsonIgnore
	private CustomerDto customerDto;
	
	private double creditLimit;
	
	private double availableLimit;
	
	private String cardNumber;
	
	private double interestRate;
	
	private LocalDateTime createdAt;

	public CreditCardDto() {
		super();
	}

	public CreditCardDto(int creditCardId, CustomerDto customerDto, double creditLimit, double availableLimit,
			String cardNumber, double interestRate, LocalDateTime createdAt) {
		super();
		this.creditCardId = creditCardId;
		this.customerDto = customerDto;
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

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
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
