package com.creditCardManagementSystem.mappers;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.entities.CreditCard;

public class CreditCardMapper {
	
	public CreditCardDto toCreditCardDto(CreditCard cred) {
		
		CreditCardDto credDto = new CreditCardDto();
		
		credDto.setCreditCardId(cred.getCreditCardId());
		credDto.setCardNumber(cred.getCardNumber());
		credDto.setAvailableLimit(cred.getAvailableLimit());
		credDto.setCreditLimit(cred.getCreditLimit());
		credDto.setCustomer(cred.getCustomer());
		credDto.setInterestRate(cred.getInterestRate());
		credDto.setCreatedAt(cred.getCreatedAt());
		
		return credDto;
		
	}
	
 public CreditCard toCreditCardEntity(CreditCardDto credDto) {
	 
	 CreditCard cred = new CreditCard();
	 
	 cred.setAvailableLimit(credDto.getAvailableLimit());
	 cred.setCardNumber(credDto.getCardNumber());
	 cred.setCreatedAt(credDto.getCreatedAt());
	 cred.setCreditCardId(credDto.getCreditCardId());
	 cred.setCreditLimit(credDto.getCreditLimit());
	 cred.setCustomer(credDto.getCustomer());
	 cred.setInterestRate(credDto.getInterestRate());
	 
	 return cred;
 }
	
}
