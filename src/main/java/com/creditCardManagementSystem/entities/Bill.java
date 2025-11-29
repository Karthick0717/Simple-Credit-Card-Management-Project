package com.creditCardManagementSystem.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.creditCardManagementSystem.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Bill {
	
	@Id
	private int billId;
	
	@ManyToOne 
	@JoinColumn(name  = "card_id", nullable = false)
	@JsonBackReference(value = "creditcard-bill")
	private CreditCard creditCard;
	
	private double minimumDue;
	
	private LocalDateTime dueDate;
 
	@Enumerated (EnumType.STRING)
    private PaymentStatus paymentStatus;
	
	@OneToMany (mappedBy = "bill")
	@JsonManagedReference(value = "bill-payments")
	private List<Payment> listOfPayments;

	
	
	
	public Bill() {
		super();
	}

	public Bill(int billId, CreditCard creditCard, double minimumDue, LocalDateTime dueDate,
			PaymentStatus paymentStatus, List<Payment> listOfPayments) {
		super();
		this.billId = billId;
		this.creditCard = creditCard;
		this.minimumDue = minimumDue;
		this.dueDate = dueDate;
		this.paymentStatus = paymentStatus;
		this.listOfPayments = listOfPayments;
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

	public List<Payment> getListOfPayments() {
		return listOfPayments;
	}

	public void setListOfPayments(List<Payment> listOfPayments) {
		this.listOfPayments = listOfPayments;
	}

}
