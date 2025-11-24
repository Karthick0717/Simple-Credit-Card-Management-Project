package com.creditCardManagementSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
   
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


	@Id
	private int customerId;
    
	private String name;
	
	private String emailId;

	
	public Customer(int customerId, String name, String emailId) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
	}


	public Customer() {
		super();
	}
	
	
	
	
}
