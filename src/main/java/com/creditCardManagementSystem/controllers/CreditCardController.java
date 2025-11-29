package com.creditCardManagementSystem.controllers;

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
import com.creditCardManagementSystem.services.CreditCardService;

@RestController
@RequestMapping("/api/creditcard/")
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	
	@PostMapping
	public ResponseEntity<CreditCardDto> addCreditCard(@RequestBody CreditCardDto creditCardDto) {
		
		CreditCardDto saveCreditCardDto = creditCardService.addCreditCard(creditCardDto);
		
		return new ResponseEntity<CreditCardDto>(saveCreditCardDto, HttpStatus.CREATED);
	} 
	
	@GetMapping ("/v1/{cardId}")
	public ResponseEntity<CreditCardDto> getCreditCardDetails(@PathVariable Integer cardId){
		
		CreditCardDto gettingGettingCreditCardById = creditCardService.getCreditCardById(cardId);
		
		return new ResponseEntity<CreditCardDto>(gettingGettingCreditCardById, HttpStatus.FOUND);
		
	}
	
	
	
}
