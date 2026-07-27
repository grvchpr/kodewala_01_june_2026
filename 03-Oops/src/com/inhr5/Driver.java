package com.inhr5;

class Zomato {
	public static void orderFood() {
		System.out.println("Order food from Zomato");
	}

	public static void orderFood(String food) {
		System.out.println("Order " + food + " from Zomato");
	}

	public static void orderFood(String food, int quantity) {
		System.out.println("Order " + quantity + " " + food + " from Zomato");
	}

	public static void orderFood(String food, int quantity, String address) {
		System.out.println("Order " + quantity + " " + food + " from Zomato to " + address);
	}

	public static void orderFood(String food, int quantity, String address, String paymentMethod) {
		System.out.println("Order " + quantity + " " + food + " from Zomato to " + address + " using " + paymentMethod);
	}
}

public class Driver {
	public static void main(String[] args) {
		Zomato.orderFood();
		Zomato.orderFood("Pizza");
		Zomato.orderFood("Burger", 2);
		Zomato.orderFood("Pasta", 3, "123 Main St");
		Zomato.orderFood("Sushi", 4, "456 Elm St", "Credit Card");
	}
}
