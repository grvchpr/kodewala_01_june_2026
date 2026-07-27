package com.fooddelivery;

public interface IFoodDelivery {

	public void searchRestaurant(String restaurantName);
	public void placeOrder(String foodItem);
	public void makePayment(double amount);
	public void trackOrder();
	public void cancelOrder();
	public void rateDelivery(int rating);
}