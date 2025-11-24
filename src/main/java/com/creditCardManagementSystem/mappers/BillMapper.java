package com.creditCardManagementSystem.mappers;

import org.modelmapper.ModelMapper;

import com.creditCardManagementSystem.dtos.BillDto;
import com.creditCardManagementSystem.entities.Bill;

public class BillMapper {
	
	ModelMapper modelMapper = new ModelMapper();
	
	public BillDto toBillDto(Bill bill) {
		
		BillDto billDto = modelMapper.map(bill, BillDto.class);
		
		return billDto;
		
	}
	
	public Bill toBillEntity(BillDto billDto) {
		
		Bill billEntity = modelMapper.map(billDto, Bill.class);
		
		return billEntity;
	}

}
