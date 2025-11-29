package com.creditCardManagementSystem.services;

import com.creditCardManagementSystem.dtos.CreditCardDto;

public interface CreditCardService {
	
	public CreditCardDto addCreditCard(CreditCardDto creditCardDto);
	
	public CreditCardDto getCreditCardById(Integer cardId);

}
