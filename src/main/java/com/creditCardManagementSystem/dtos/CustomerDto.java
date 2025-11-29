	package com.creditCardManagementSystem.dtos;

import java.util.List;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class CustomerDto {
	
	@NotNull(message = "id should not be null")
	private int customerId;
    
	@NotNull (message = "name should not be null")
	private String name;
	
	@Email (message = "enter mail id in correct format")
	private String emailId;
	
	
	private List<CreditCardDto> listOfCreditCards; 
	
	
	private List<CardTransactionDto> listOfCardTransactions;

	public CustomerDto() {
		super();
	}

	public CustomerDto(int customerId, @NotNull(message = "name should not be null") String name,
			@Email(message = "enter mail id in correct format") String emailId, List<CreditCardDto> listOfCreditCards,
			List<CardTransactionDto> listOfCardTransactions) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
		this.listOfCreditCards = listOfCreditCards;
		this.listOfCardTransactions = listOfCardTransactions;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<CreditCardDto> getListOfCreditCards() {
		return listOfCreditCards;
	}

	public void setListOfCreditCards(List<CreditCardDto> listOfCreditCards) {
		this.listOfCreditCards = listOfCreditCards;
	}

	public List<CardTransactionDto> getListOfCardTransactions() {
		return listOfCardTransactions;
	}

	public void setListOfCardTransactions(List<CardTransactionDto> listOfCardTransactions) {
		this.listOfCardTransactions = listOfCardTransactions;
	}
	

}