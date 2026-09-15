package com.kodewala.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	int productId;
	String productName;

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public int compareTo(Product o) {
		int result = Integer.compare(this.productId, o.productId);
		return result;
	}
}

public class Driver {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "Macbook Pro");
		Product p2 = new Product(100, "iPhone17");
		Product p3 = new Product(1200, "Samsung S26");
		Product p4 = new Product(99, "OnePlus 12");
		Product p5 = new Product(1030, "Google Pixel 8");

		List<Product> products = new ArrayList<>();

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

		System.out.println("======Before Sorting======");
		for (Product product : products) {
			System.out.println(product.productId + " " + product.productName);
		}
		System.out.println();
		System.out.println("======After Sorting======");

		Collections.sort(products);

		// Iterator<Product> iterator = products.iterator();
		for (Product product : products) {
			System.out.println(product.productId + " " + product.productName);
		}
	}

}
