package com.inhr4;

class Delivery {
	public void doDelivery() {
		System.out.println("Delivery is done from Delivery class");
	}
}

class expressDelivery extends Delivery {
	public void doDelivery() {
		System.out.println("Delivery is done from expressDelivery class");
	}
}

class normalDelivery extends Delivery {
	public void doDelivery() {
		System.out.println("Delivery is done from normalDelivery class");
	}
}

public class Driver {
	public static void main(String[] args) {
		Delivery d1 = new expressDelivery();
		d1.doDelivery();

		Delivery d2 = new normalDelivery();
		d2.doDelivery();
	}
}
