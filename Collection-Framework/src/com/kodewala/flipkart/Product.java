package com.kodewala.flipkart;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {

	private int productId;
	private String name;
	private double price;
	private String status;

	public Product(int productId, String name, double price, String status) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.status = status;
	}

	@Override
	public int compareTo(Product product) {

		int result = Double.compare(this.price, product.price);
		System.out.println("Comparing " + this.name + " with " + product.name + " : " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (!(obj instanceof Product))
			return false;

		Product product = (Product) obj;

		return this.productId == product.productId;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(productId);
	}
}