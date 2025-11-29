package com.creditCardManagementSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditCardManagementSystem.dtos.CardTransactionDto;
import com.creditCardManagementSystem.entities.CardTransaction;
import com.creditCardManagementSystem.mappers.CardTransactionMapper;
import com.creditCardManagementSystem.repositories.CardTransactionRepository;
import com.creditCardManagementSystem.services.CardTransactionService;


@Service
public class CardTransactionServiceImpl implements CardTransactionService {

	@Autowired
	private CardTransactionRepository cardTransactionRepository;
	
	@Autowired
	private CardTransactionMapper cardTransactionMapper;

	@Override
	public CardTransactionDto addCardTransaction(CardTransactionDto cardTrans) {
		
		CardTransaction saveCardTransactionEntity = cardTransactionMapper.toCardTransactionEntity(cardTrans);
		
		CardTransaction saveCardTransaction = cardTransactionRepository.save(saveCardTransactionEntity);
		
		CardTransactionDto savecardTransDto = cardTransactionMapper.toCardTransactionDto(saveCardTransaction);
		
		return savecardTransDto;
	}


	
	

	
	}


