package com.sbi.payment.cash;

import com.sbi.payment.Payment;

public class CashPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Bill of " + amount + " Rs. paid using cash");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println(amount + " Rs. cash Refunded");
	}

}
