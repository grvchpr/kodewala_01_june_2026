package com.sbi.payment.upi;

import com.sbi.payment.PaymentMgmt;

public class UPIPayment extends PaymentMgmt {

	private String upiId;
	private String phoneNumber;

	public UPIPayment(String upiId, String phoneNumber) {
		this.upiId = upiId;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("===== UPI Payment Processing =====");
		System.out.println("UPI ID: " + upiId);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Amount: ₹" + amount);
		System.out.println("Sending payment request...");
		System.out.println("Enter UPI PIN to confirm...");
		System.out.println("✓ Payment of ₹" + amount + " processed successfully via UPI");
		System.out.println("Transaction ID: UPI" + System.currentTimeMillis());
		System.out.println("====================================\n");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("===== UPI Refund Processing =====");
		System.out.println("UPI ID: " + upiId);
		System.out.println("Refund Amount: ₹" + amount);
		System.out.println("Processing refund...");
		System.out.println("✓ Refund of ₹" + amount + " initiated via UPI");
		System.out.println("Amount will be credited instantly");
		System.out.println("Refund ID: REFUND" + System.currentTimeMillis());
		System.out.println("====================================\n");
	}

}
