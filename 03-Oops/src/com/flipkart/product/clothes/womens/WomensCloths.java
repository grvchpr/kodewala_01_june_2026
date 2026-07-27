package com.flipkart.product.clothes.womens;

import com.flipkart.product.clothes.ClothingProducts;

public class WomensCloths extends ClothingProducts {

	public String style;

	public void displayWomensCloths() {
		displayClothindProducts();
		displayProductDetails();
		System.out.println("Style: " + style);
	}
}
