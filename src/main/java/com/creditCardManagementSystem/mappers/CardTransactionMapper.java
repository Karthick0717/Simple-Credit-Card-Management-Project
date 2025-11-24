package com.creditCardManagementSystem.mappers;

import org.modelmapper.ModelMapper;

import com.creditCardManagementSystem.dtos.CardTransactionDto;
import com.creditCardManagementSystem.entities.CardTransaction;

public class CardTransactionMapper {

	public CardTransactionDto toCardTransactioDto(CardTransaction cardTransaction) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		CardTransactionDto cardDto = modelMapper.map(cardTransaction, CardTransactionDto.class);
	
		return cardDto;
	}
	
	public CardTransaction toCardTransactionEntity(CardTransactionDto cardTransactionDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		CardTransaction cardEntity = modelMapper.map(cardTransactionDto, CardTransaction.class);
		
		return cardEntity;
	}
	
	
}
