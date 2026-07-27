package com.zomato;

import com.fooddelivery.IFoodDelivery;

public class Zomato implements IFoodDelivery {

	@Override
	public void searchRestaurant(String restaurantName) {
		System.out.println("Searching " + restaurantName + " on Zomato.");
	}

	@Override
	public void placeOrder(String foodItem) {
		System.out.println(foodItem + " ordered using Zomato.");
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid ₹" + amount + " using Zomato.");
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking order on Zomato.");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order cancelled on Zomato.");
	}

	@Override
	public void rateDelivery(int rating) {
		System.out.println("Zomato Delivery Rating: " + rating + "/5");
	}
}