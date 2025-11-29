package com.creditCardManagementSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.dtos.CustomerDto;
import com.creditCardManagementSystem.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping ("/api/customer/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customerDto){ // @Valid -> so that it will validate if we are entering any null values or not
		
		CustomerDto saveCustomerDto = customerService.addCustomerDto(customerDto);
		
		return new ResponseEntity<CustomerDto>(saveCustomerDto, HttpStatus.CREATED);
		
	}
	
	
   @GetMapping("/v1/cards/transactions/{custId}")
   public ResponseEntity<CustomerDto> getCustomerFullDetails (@PathVariable int custId){
	   
	   CustomerDto getFullCustomerDetails = customerService.getCustomerFullDetails(custId);
	   
	   return new ResponseEntity<CustomerDto>(getFullCustomerDetails, HttpStatus.FOUND);
   }
	
}
