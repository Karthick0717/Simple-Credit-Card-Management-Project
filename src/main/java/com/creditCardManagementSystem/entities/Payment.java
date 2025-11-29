package com.creditCardManagementSystem.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Payment {

	@Id
	private int paymentId;
	
	@ManyToOne
	@JoinColumn(name = "bill_id", nullable=false)
	@JsonBackReference (value = "bill-payments")
	private Bill bill;
	
	private double amountPaid;
	
	private LocalDateTime paymentDate;

	@ManyToOne
	@JoinColumn(name = "creditcard_id",nullable=false)  //foreign key 
	@JsonBackReference (value = "creditcard-payments")
	private CreditCard creditCard;

	public Payment() {
		super();
	}

	public Payment(int paymentId, Bill bill, double amountPaid, LocalDateTime paymentDate, CreditCard creditCard) {
		super();
		this.paymentId = paymentId;
		this.bill = bill;
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
		this.creditCard = creditCard;
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

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
}
