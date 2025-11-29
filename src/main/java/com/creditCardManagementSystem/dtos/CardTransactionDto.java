package com.creditCardManagementSystem.dtos;

import com.creditCardManagementSystem.enums.TransactionType;

import jakarta.validation.constraints.NotNull;

public class CardTransactionDto {
	
	@NotNull (message = " transactionId should not be null")
    private int transactionId;
   	
	
	private CustomerDto customerDto;
	
	
	private CreditCardDto creditCardDto;
	
	@NotNull (message = "merchant name should not be null")
	private String merchantName;
	
	
	private TransactionType type;

    private double amount;

	public CardTransactionDto() {
		super();
	}

	public CardTransactionDto(@NotNull(message = " transactionId should not be null") int transactionId,
			CustomerDto customerDto, CreditCardDto creditCardDto,
			@NotNull(message = "merchant name should not be null") String merchantName, TransactionType type,
			double amount) {
		super();
		this.transactionId = transactionId;
		this.customerDto = customerDto;
		this.creditCardDto = creditCardDto;
		this.merchantName = merchantName;
		this.type = type;
		this.amount = amount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}

	public CreditCardDto getCreditCardDto() {
		return creditCardDto;
	}

	public void setCreditCardDto(CreditCardDto creditCardDto) {
		this.creditCardDto = creditCardDto;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    
}
	
