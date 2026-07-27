package com.swiggy;

public class VegFood extends Food {

	public String vegType;
	public int qty;

	public void display() {
		super.display();
		System.out.println("Veg Food type: " + vegType);
		System.out.println("Quantity: " + qty);
	}
}
