package com.kodewala.set3;

import java.util.HashSet;
import java.util.Set;

class Payment {
	private String paymentType;

	public Payment(String paymentType) {
		super();
		this.paymentType = paymentType;
	}

	@Override
	public int hashCode() {
		return paymentType.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Payment payment = (Payment) obj;
		return this.paymentType.equals(payment.paymentType);
	}

}

public class Driver {

	public static void main(String[] args) {
		Set<Payment> set = new HashSet<Payment>();
		Payment p1 = new Payment("Credit Card"); // hashCode: 1304940503
		Payment p2 = new Payment("Credit Card"); // hashCode: 1304940503
		System.out.println("P1 hashCode: " + p1.hashCode() + "\nP2 hashCode: " + p2.hashCode());
		System.out.println("Are P1 and P2 equal? " + p1.equals(p2));

		set.add(p1);
		set.add(p2);
		System.out.println(set);
	}

}
