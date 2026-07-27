package com.flipkart.product.clothes.mens;

import com.flipkart.product.clothes.ClothingProducts;

public class MensCloths extends ClothingProducts {
	public String type;


	public void displayMensCloths() {
		displayClothindProducts();
		displayProductDetails();
		System.out.println("Type: " + type);
	}
}
