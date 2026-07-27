package com.sbi.user2;

class PaymentSystem {
	PaymentSystem() {
		System.out.println("PaymentSystem object created");
	}
}

class Payment extends PaymentSystem {
	Payment() {
		System.out.println("Payment object created");
	}
}

class UPIPayment extends Payment {
	UPIPayment() {
		System.out.println("UPIPayment object created");
	}

}

public class Driver {

	public static void main(String[] args) {

		UPIPayment upi = new UPIPayment();
		UPIPayment upi1 = new UPIPayment();


		System.out.println(upi.equals(upi1));
		System.out.println(upi.hashCode());
		System.out.println(upi.toString());
		System.out.println(upi.getClass());

	}

}
