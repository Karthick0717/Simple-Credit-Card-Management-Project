package com.creditCardManagementSystem.mappers;

import org.modelmapper.ModelMapper;

import com.creditCardManagementSystem.dtos.PaymentDto;
import com.creditCardManagementSystem.entities.Payment;

public class PaymentMapper {

	ModelMapper modelMapper = new ModelMapper();
	
	public PaymentDto toPaymentDto(Payment payment) {
		
		PaymentDto paymentDto = modelMapper.map(payment, PaymentDto.class);
		
		return paymentDto;
	}
	

	public Payment toPaymentEntity(PaymentDto paymentDto) {
		
		Payment paymentEntity = modelMapper.map(paymentDto, Payment.class);
		
		return paymentEntity;
		
	}
	
}
