package com.creditCardManagementSystem.entities;

import java.time.LocalDateTime;

import com.creditCardManagementSystem.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bill {
	
	@Id
	private int billId;
	
	private CreditCard creditCard;
	
	private double minimumDue;
	
	private LocalDateTime dueDate;
 
	@Enumerated (EnumType.STRING)
    private PaymentStatus paymentStatus;

	
	public Bill(int billId, CreditCard creditCard, double minimumDue, LocalDateTime dueDate,
			PaymentStatus paymentStatus) {
		super();
		this.billId = billId;
		this.creditCard = creditCard;
		this.minimumDue = minimumDue;
		this.dueDate = dueDate;
		this.paymentStatus = paymentStatus;
	}

	public Bill() {
		super();
	}
	
	
	
	
}
