package com.inhr2;

class Delivery {
	static void deliver() {
		System.out.println("Delivery from Delivery class");
	}
}

class expressDelivery extends Delivery {
	static void deliver() {
		System.out.println("Delivery from expressDelivery class");
	}
}

public class Driver {

	public static void main(String[] args) {
		Delivery.deliver();
		expressDelivery.deliver();
	}

}
