package com.swiggy;

public class Swiggy {

	public static void main(String[] args) {
		System.out.println("Veg Food - Details");
		VegFood vegFood = new VegFood();
		vegFood.type = "Veg";
		vegFood.qty = 1;
		vegFood.vegType = "Paneer Butter Masala";
		vegFood.display();

		System.out.println("\nNon Veg Food - Details");
		NonVegFood nonVegFood = new NonVegFood();
		nonVegFood.type = "Non-Veg";
		nonVegFood.price = 250;
		nonVegFood.nonVegType = "Chicken Biryani";
		nonVegFood.display();
	}

}
