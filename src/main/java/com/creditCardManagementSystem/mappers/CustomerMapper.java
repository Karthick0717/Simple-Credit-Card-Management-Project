package com.creditCardManagementSystem.mappers;

import com.creditCardManagementSystem.dtos.CustomerDto;
import com.creditCardManagementSystem.entities.Customer;

public class CustomerMapper {
	
	public CustomerDto toCustomerDto(Customer cus) {
		
		CustomerDto cusDtoObj = new CustomerDto();
		
		cusDtoObj.setCustomerId(cus.getCustomerId());
		cusDtoObj.setName(cus.getName());
		cusDtoObj.setEmailId(cus.getEmailId());
		
		return cusDtoObj;
		
	}
	
	
	public Customer toCustomerEntity(CustomerDto cusDto) {
		
		Customer cusObj = new Customer();
		
		cusObj.setCustomerId(cusDto.getCustomerId());
		cusObj.setName(cusDto.getName());
		cusObj.setEmailId(cusDto.getEmailId());
		
		return cusObj;
	}

}
