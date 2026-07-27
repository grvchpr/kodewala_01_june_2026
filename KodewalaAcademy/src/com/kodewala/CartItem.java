package com.kodewala;

public class CartItem {

	private String restaurant;
	private String foodName;
	private int quantity;
	private int price;

	public CartItem(String restaurant, String foodName, int quantity, int price) {
		this.restaurant = restaurant;
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public String getFoodName() {
		return foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return quantity * price;
	}
}