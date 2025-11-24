package com.creditCardManagementSystem.dtos;

import java.time.LocalDateTime;

import com.creditCardManagementSystem.entities.Bill;

import jakarta.validation.constraints.NotNull;

public class PaymentDto {
	
	@NotNull (message = "payment id should not be null")
    private int paymentId;
 	
	private Bill bill;
	
	private double amountPaid;
	
	private LocalDateTime paymentDate;

	public PaymentDto() {
		super();
	}

	public PaymentDto(@NotNull(message = "payment id should not be null") int paymentId, Bill bill, double amountPaid,
			LocalDateTime paymentDate) {
		super();
		this.paymentId = paymentId;
		this.bill = bill;
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

}
