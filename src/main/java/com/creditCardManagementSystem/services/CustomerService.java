package com.creditCardManagementSystem.services;

import java.util.List;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.dtos.CustomerDto;


public interface CustomerService {
	
	public CustomerDto addCustomerDto(CustomerDto customerDto);
	
	public CustomerDto getCustomerFullDetails (int custId);
	
	
}
