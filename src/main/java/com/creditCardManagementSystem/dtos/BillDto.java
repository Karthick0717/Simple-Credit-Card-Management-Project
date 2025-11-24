package com.creditCardManagementSystem.dtos;

import java.time.LocalDateTime;

import com.creditCardManagementSystem.entities.CreditCard;
import com.creditCardManagementSystem.enums.PaymentStatus;

import jakarta.validation.constraints.NotNull;


public class BillDto {
	
    @NotNull (message = "bill id should not be null")
	private int billId;
	
	private CreditCard creditCard;
	
	private double minimumDue;
	
	private LocalDateTime dueDate;
 
    private PaymentStatus paymentStatus;

	public BillDto() {
		super();
	}

	public BillDto(@NotNull(message = "bill id should not be null") int billId, CreditCard creditCard,
			double minimumDue, LocalDateTime dueDate, PaymentStatus paymentStatus) {
		super();
		this.billId = billId;
		this.creditCard = creditCard;
		this.minimumDue = minimumDue;
		this.dueDate = dueDate;
		this.paymentStatus = paymentStatus;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public double getMinimumDue() {
		return minimumDue;
	}

	public void setMinimumDue(double minimumDue) {
		this.minimumDue = minimumDue;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


}
