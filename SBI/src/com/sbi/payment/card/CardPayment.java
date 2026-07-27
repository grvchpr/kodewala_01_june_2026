package com.sbi.payment.card;

import com.sbi.payment.PaymentMgmt;

public class CardPayment extends PaymentMgmt {

	private String cardNumber;
	private String cardHolderName;

	public CardPayment(String cardNumber, String cardHolderName) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("===== Card Payment Processing =====");
		System.out.println("Card Holder: " + cardHolderName);
		System.out.println("Card Number: " + cardNumber.substring(cardNumber.length() - 4));
		System.out.println("Amount: ₹" + amount);
		System.out.println("Processing card payment...");
		System.out.println("✓ Payment of ₹" + amount + " processed successfully via Card");
		System.out.println("Transaction ID: CARD" + System.currentTimeMillis());
		System.out.println("====================================\n");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("===== Card Refund Processing =====");
		System.out.println("Card Holder: " + cardHolderName);
		System.out.println("Refund Amount: ₹" + amount);
		System.out.println("Processing refund...");
		System.out.println("✓ Refund of ₹" + amount + " initiated to Card");
		System.out.println("Refund will be credited in 3-5 business days");
		System.out.println("Refund ID: REFUND" + System.currentTimeMillis());
		System.out.println("====================================\n");
	}

}
