package com.sbi.payment.upi;

import com.sbi.payment.Payment;

public class UPIPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing " + amount + " Rs. using UPI");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println(amount + " Rs. Refunded");
	}

	@Override
	public void generateReceipt(double amount) {
		System.out.println("Receipt generated for " + amount + " Rs. using UPI");
	}

	@Override
	public void chechBalance(double amount) {
		System.out.println("Checking balance using UPI");
	}

	@Override
	public void transactionHistory() {
		System.out.println("Transaction history of UPI Payment");
	}

}
