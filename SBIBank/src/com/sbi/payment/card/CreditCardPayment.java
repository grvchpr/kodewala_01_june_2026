package com.sbi.payment.card;

import com.sbi.payment.Payment;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing " + amount + " Rs. using credit card");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println(amount + " Rs. Refunded");
	}

	@Override
	public void generateReceipt(double amount) {
		System.out.println("Receipt generated for " + amount + " Rs. using credit card");
	}

	@Override
	public void chechBalance(double amount) {
		System.out.println("Checking balance for of credit card");
	}

	@Override
	public void transactionHistory() {
		System.out.println("Transaction history of credit card");
	}

}
