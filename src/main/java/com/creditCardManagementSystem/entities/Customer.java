package com.creditCardManagementSystem.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Customer {
   
	
	@Id
	@Column(name = "customer_id")
	private int customerId;
    
	private String name;
	
	@Column(name = "email_id")
	private String emailId;
	
	@OneToMany (mappedBy = "customer")
	@JsonManagedReference(value = "customer-creditcard")
	private List<CreditCard> listOfCreditCards;

	@OneToMany (mappedBy = "customer")
	@JsonManagedReference (value = "customer-cardtransaction")
	private List<CardTransaction> listOfCardTransactions;

	public Customer() {
		super();
	}

	public Customer(int customerId, String name, String emailId, List<CreditCard> listOfCreditCards,
			List<CardTransaction> listOfCardTransactions) {
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

	public List<CreditCard> getListOfCreditCards() {
		return listOfCreditCards;
	}

	public void setListOfCreditCards(List<CreditCard> listOfCreditCards) {
		this.listOfCreditCards = listOfCreditCards;
	}

	public List<CardTransaction> getListOfCardTransactions() {
		return listOfCardTransactions;
	}

	public void setListOfCardTransactions(List<CardTransaction> listOfCardTransactions) {
		this.listOfCardTransactions = listOfCardTransactions;
	}
	
}
