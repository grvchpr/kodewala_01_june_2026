package com.fooddelivery;

import com.swiggy.Swiggy;
import com.zomato.Zomato;

public class Driver {

	public static void main(String[] args) {

		IFoodDelivery app1 = new Swiggy();
		IFoodDelivery app2 = new Zomato();

		app1.searchRestaurant("Domino's");
		app1.placeOrder("Corn Pizza");
		app1.makePayment(499);
		app1.trackOrder();
		app1.cancelOrder();
		app1.rateDelivery(5);

		System.out.println("----------------------");

		app2.searchRestaurant("Ultimate Punjab");
		app2.placeOrder("Veg Punjabi Thali");
		app2.makePayment(299);
		app2.trackOrder();
		app2.cancelOrder();
		app2.rateDelivery(4);

	}
}