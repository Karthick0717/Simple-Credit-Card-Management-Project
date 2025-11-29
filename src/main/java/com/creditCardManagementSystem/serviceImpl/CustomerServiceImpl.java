package com.creditCardManagementSystem.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.dtos.CustomerDto;
import com.creditCardManagementSystem.entities.CardTransaction;
import com.creditCardManagementSystem.entities.CreditCard;
import com.creditCardManagementSystem.entities.Customer;
import com.creditCardManagementSystem.mappers.CardTransactionMapper;
import com.creditCardManagementSystem.mappers.CreditCardMapper;
import com.creditCardManagementSystem.mappers.CustomerMapper;
import com.creditCardManagementSystem.repositories.CustomerRepository;
import com.creditCardManagementSystem.services.CustomerService;

import jakarta.validation.Valid;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CreditCardMapper creditCardMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private CardTransactionMapper cardTransactionMapper;
	
	
	@Override
	public CustomerDto addCustomerDto(@Valid CustomerDto customerDto) { 
		
		Customer customerEntity = customerMapper.toCustomerEntity(customerDto); // converting to entity
		
		customerRepository.save(customerEntity); //saving entity
		
		CustomerDto customerDto1 = customerMapper.toCustomerDto(customerEntity); //converting to dto
		
		return customerDto1;
	}


	@Override
	public CustomerDto getCustomerFullDetails(int custId) {
		
		Customer customer = customerRepository.findCustomerBasicDetails(custId);
		
		List<CreditCard> cards = customerRepository.findCreditCardsByCustomer(custId);
		
		List<CardTransaction> transactions = customerRepository.findCardTransactionsByCustomer(custId);
		
		CustomerDto customerDto = customerMapper.toCustomerDto(customer);
		
		customerDto.setListOfCreditCards(creditCardMapper.toListOfCreditCardDto(cards));
		
		customerDto.setListOfCardTransactions(cardTransactionMapper.toListOfCardTransactionDto(transactions));
		
		return customerDto;
	}



	
	
	}




