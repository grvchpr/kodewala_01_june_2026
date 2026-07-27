package com.kodewala;

import java.util.ArrayList;
import java.util.Scanner;

public class Swiggy {

	// ArrayList to hold multiple items in the cart
	private static ArrayList<CartItem> cart = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Welcome to Zomato *****");

		while (true) {
			System.out.println("\n1. View Restaurants");
			System.out.println("2. View Cart");
			System.out.println("3. Place Order (Checkout)");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				viewRestaurants(sc);
				break;
			case 2:
				viewCart();
				break;
			case 3:
				placeOrder(sc);
				break;
			case 4:
				System.out.println("Thank you for using Zomato!");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

	private static void viewRestaurants(Scanner sc) {
		System.out.println("\nAvailable Restaurants:");
		System.out.println("1. Dominos");
		System.out.println("2. KFC");
		System.out.println("3. Burger King");
		System.out.println("4. Pizza Hut");
		System.out.println("5. Back");

		System.out.print("Choose Restaurant: ");
		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:
			restaurantMenu(sc, "Dominos");
			break;
		case 2:
			restaurantMenu(sc, "KFC");
			break;
		case 3:
			restaurantMenu(sc, "Burger King");
			break;
		case 4:
			restaurantMenu(sc, "Pizza Hut");
			break;
		case 5:
			return;
		default:
			System.out.println("Invalid Choice!");
		}
	}

	private static void restaurantMenu(Scanner sc, String restaurantName) {
		while (true) {
			System.out.println("\nWelcome to " + restaurantName);
			System.out.println("1. Search Food & Check Prices");
			System.out.println("2. Add to Cart");
			System.out.println("3. Back");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				searchFood(sc, restaurantName);
				break;
			case 2:
				addToCart(sc, restaurantName);
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

	private static void searchFood(Scanner sc, String restaurantName) {
		System.out.print("Enter food name: ");
		String food = sc.nextLine();
		int price = getFoodPrice(food);

		if (price != -1) {
			System.out.println(food + " is available at " + restaurantName + " for Rs. " + price);
		} else {
			System.out.println(food + " is not available here or invalid item name.");
		}
	}

	// NEW METHOD: Adds item to the global ArrayList cart
	private static void addToCart(Scanner sc, String restaurantName) {
		System.out.print("Enter food name: ");
		String food = sc.nextLine();

		int price = getFoodPrice(food);
		if (price == -1) {
			System.out.println("Sorry, we don't serve " + food + ".");
			return;
		}

		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		sc.nextLine();

		if (quantity <= 0) {
			System.out.println("Quantity must be greater than 0.");
			return;
		}

		// Add item to ArrayList
		cart.add(new CartItem(restaurantName, food, quantity, price));
		System.out.println("\n" + food + " added to cart successfully!");
	}

	// NEW METHOD: Displays current cart content and running subtotal
	private static void viewCart() {
		if (cart.isEmpty()) {
			System.out.println("\nYour cart is empty!");
			return;
		}

		System.out.println("\n--- Current Cart ---");
		int grandTotal = 0;
		for (int i = 0; i < cart.size(); i++) {
			CartItem item = cart.get(i);
			int totalItemAmount = item.getPrice() * item.getQuantity();
			grandTotal += totalItemAmount;

			System.out.println((i + 1) + ". " + item.getFoodName() + " (" + item.getRestaurant() + ")");
			System.out.println("   Qty: " + item.getQuantity() + " | Price: " + item.getPrice() + " | Total: " + totalItemAmount);
		}
		System.out.println("--------------------");
		System.out.println("Grand Total: Rs. " + grandTotal);
	}

	// UPDATED METHOD: Displays final breakdown of all items and checks out
	private static void placeOrder(Scanner sc) {
		if (cart.isEmpty()) {
			System.out.println("\nYour cart is empty! Cannot place an order.");
			return;
		}

		System.out.println("\n----- Order Summary -----");
		int grandTotal = 0;

		for (CartItem item : cart) {
			int totalAmount = item.getPrice() * item.getQuantity();
			grandTotal += totalAmount;

			System.out.println("Restaurant : " + item.getRestaurant());
			System.out.println("Food       : " + item.getFoodName());
			System.out.println("Quantity   : " + item.getQuantity());
			System.out.println("Price      : " + item.getPrice());
			System.out.println("Total      : " + totalAmount);
			System.out.println("-------------------------");
		}

		System.out.println("Final Bill Amount: Rs. " + grandTotal);
		System.out.print("Confirm Order? (yes/no): ");
		String confirm = sc.nextLine();

		if (confirm.equalsIgnoreCase("yes")) {
			System.out.println("\nOrder Placed Successfully! Happy Eating!");
			cart.clear(); // Clear the ArrayList after successful checkout
		} else {
			System.out.println("\nCheckout cancelled. Your items are still in the cart.");
		}
	}

	// Helper method to fetch hardcoded price lists dynamically
	private static int getFoodPrice(String foodName) {
		if (foodName.equalsIgnoreCase("Pizza")) {
			return 299;
		} else if (foodName.equalsIgnoreCase("Garlic Bread")) {
			return 149;
		} else if (foodName.equalsIgnoreCase("Veg Burger") || foodName.equalsIgnoreCase("Burger")) {
			return 199;
		}
		return -1; // Item not found flag
	}
}
