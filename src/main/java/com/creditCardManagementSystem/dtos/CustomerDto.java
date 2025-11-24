package com.creditCardManagementSystem.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class CustomerDto {
	
	private int customerId;
    
	@NotNull (message = "name should not be null")
	private String name;
	
	@Email (message = "enter mail id in correct format")
	private String emailId;

	public CustomerDto(int customerId, String name, String emailId) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
	}

	public CustomerDto() {
		super();
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

	
}
