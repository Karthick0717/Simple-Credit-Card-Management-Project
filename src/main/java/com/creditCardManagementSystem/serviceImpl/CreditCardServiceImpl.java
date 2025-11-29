package com.creditCardManagementSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditCardManagementSystem.dtos.CreditCardDto;
import com.creditCardManagementSystem.entities.CreditCard;
import com.creditCardManagementSystem.mappers.CreditCardMapper;
import com.creditCardManagementSystem.repositories.CreditCardRepository;
import com.creditCardManagementSystem.services.CreditCardService;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardRepository creditCardRepository;
	
	@Autowired
	private CreditCardMapper creditCardMapper;
	
	
	@Override
	public CreditCardDto addCreditCard(CreditCardDto creditCardDto) {
			
		CreditCard creditCardEntity = creditCardMapper.toCreditCardEntity(creditCardDto); 
		
		CreditCard saveCreditCardEntity = creditCardRepository.save(creditCardEntity);
		
		CreditCardDto saveCreditCardDto = creditCardMapper.toCreditCardDto(saveCreditCardEntity);
		
		return saveCreditCardDto;
	}


	@Override
	public CreditCardDto getCreditCardById(Integer cardId) {
		
		CreditCard getCreditCardById = creditCardRepository.getReferenceById(cardId); //searching in repo
		
		CreditCardDto getCreditCardDtoById = creditCardMapper.toCreditCardDto(getCreditCardById); //converting to dto
		
		return getCreditCardDtoById; //then returning that DTO
	}


	




}
