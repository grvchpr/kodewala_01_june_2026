package com.flipkart;

import com.flipkart.product.clothes.mens.MensCloths;
import com.flipkart.product.clothes.womens.WomensCloths;

public class Flipkart {

	public static void main(String[] args) {
		MensCloths mensCloth = new MensCloths();
		WomensCloths womensCloth = new WomensCloths();

		System.out.println("========= Mens Cloth Details =========");
		mensCloth.productId = 101;
		mensCloth.brand = "Levi's";
		mensCloth.size = "XL";
		mensCloth.color = "Blue";
		mensCloth.type = "Jeans";
		mensCloth.displayMensCloths();

		System.out.println("\n========= Womens Cloth Details =========");
		womensCloth.productId = 201;
		womensCloth.brand = "Zara";
		womensCloth.size = "M";
		womensCloth.color = "Pink";
		womensCloth.style = "Dress";
		womensCloth.displayWomensCloths();
	}

}
