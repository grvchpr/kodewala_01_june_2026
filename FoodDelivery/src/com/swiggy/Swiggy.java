package com.swiggy;

import com.fooddelivery.IFoodDelivery;

public class Swiggy implements IFoodDelivery {

    @Override
    public void searchRestaurant(String restaurantName) {
        System.out.println("Searching " + restaurantName + " on Swiggy.");
    }

    @Override
    public void placeOrder(String foodItem) {
        System.out.println(foodItem + " ordered using Swiggy.");
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Swiggy.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order on Swiggy.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled on Swiggy.");
    }

    @Override
    public void rateDelivery(int rating) {
        System.out.println("Swiggy Delivery Rating: " + rating + "/5");
    }
}