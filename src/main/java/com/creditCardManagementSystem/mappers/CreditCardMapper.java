package com.creditCardManagementSystem.mappers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.entities.CreditCard;


@Component
public class CreditCardMapper {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public CreditCardDto toCreditCardDto(CreditCard cred) {
	
		CreditCardDto credDto = new CreditCardDto();
		
		credDto.setCreditCardId(cred.getCreditCardId());
		credDto.setCardNumber(cred.getCardNumber());
		credDto.setAvailableLimit(cred.getAvailableLimit());
		credDto.setCreditLimit(cred.getCreditLimit());
		credDto.setCustomerDto(customerMapper.toCustomerDto(cred.getCustomer()));                                              //credDto.setCustomer(cred.getCustomer());
		credDto.setInterestRate(cred.getInterestRate());
		credDto.setCreatedAt(cred.getCreatedAt());
		
		return credDto;
		
	}
	
	//converting list of cards to list of dto cards
	public List<CreditCardDto> toListOfCreditCardDto(List<CreditCard> cards){
		
		return cards.stream()
				.map(this::toCreditCardDto)
				.toList();
		
	}
	
	
	
 public CreditCard toCreditCardEntity(CreditCardDto credDto) {
	 
	 CreditCard cred = new CreditCard();
	 
	 cred.setAvailableLimit(credDto.getAvailableLimit());
	 cred.setCardNumber(credDto.getCardNumber());
	 cred.setCreatedAt(credDto.getCreatedAt());
	 cred.setCreditCardId(credDto.getCreditCardId());
	 cred.setCreditLimit(credDto.getCreditLimit());
	 cred.setCustomer(customerMapper.toCustomerEntity(credDto.getCustomerDto()));
	 cred.setInterestRate(credDto.getInterestRate());
	 
	 return cred;
 }
	
}
