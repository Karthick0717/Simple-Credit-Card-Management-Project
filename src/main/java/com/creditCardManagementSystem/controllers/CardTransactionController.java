package com.creditCardManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditCardManagementSystem.dtos.CardTransactionDto;
import com.creditCardManagementSystem.services.CardTransactionService;

@RestController
@RequestMapping ("/api/transaction/")
public class CardTransactionController {
	
	@Autowired
	private CardTransactionService cardTransactionService;
	
    @PostMapping
	public ResponseEntity<CardTransactionDto> addCardTransaction(@RequestBody CardTransactionDto cardTrans){
		
		CardTransactionDto saveCardTransaction = cardTransactionService.addCardTransaction(cardTrans);
		
		return new ResponseEntity<CardTransactionDto>(saveCardTransaction, HttpStatus.CREATED);
	}
	
	
	
}
