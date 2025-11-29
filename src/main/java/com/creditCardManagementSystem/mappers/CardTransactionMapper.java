package com.creditCardManagementSystem.mappers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.creditCardManagementSystem.dtos.CardTransactionDto;
import com.creditCardManagementSystem.entities.CardTransaction;

@Component
public class CardTransactionMapper {

	public CardTransactionDto toCardTransactionDto(CardTransaction cardTransaction) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		CardTransactionDto cardDto = modelMapper.map(cardTransaction, CardTransactionDto.class);
	
		return cardDto;
	}
	
	public CardTransaction toCardTransactionEntity(CardTransactionDto cardTransactionDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		CardTransaction cardEntity = modelMapper.map(cardTransactionDto, CardTransaction.class);
		
		return cardEntity;
	}
	
	public List<CardTransactionDto> toListOfCardTransactionDto(List<CardTransaction> cardTransactions){
		
	return cardTransactions.stream()
			.map(this::toCardTransactionDto)
			.toList();
		
	}
	
	
}
