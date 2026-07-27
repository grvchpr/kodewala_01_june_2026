package com.flipkart.product.clothes;

import com.flipkart.product.Product;

public class ClothingProducts extends Product {
	public String size;
	public String color;


	public void displayClothindProducts() {
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
	}
}
