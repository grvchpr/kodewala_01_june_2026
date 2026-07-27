package com.swiggy;

public class NonVegFood extends Food {
	public String nonVegType;
	public int price;

	public void display() {
		super.display();
		System.out.println("Non-Veg Food type: " + nonVegType);
		System.out.println("Price: " + price);
	}
}
