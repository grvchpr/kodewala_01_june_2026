package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

public class ProductsList {

	public static void main(String[] args) {
		Product[] products = {
				new Product("MacBook M5", 90000.00),
				new Product("iPhone 18 Pro", 109000.00),
				new Product("Airpods 5", 14000.00),
				
				new Product("Apple Wath Ultra 4", 89000.00)
				
		};
		
		List<Product> productList = Arrays.asList(products);
		
		List<Product> result = productList.stream()
				.filter(product -> product.getProductPrice() > 50000)
				.map(product -> new Product(product.getProductName(), product.getProductPrice() * 0.9)) // Apply 10% discount
				.collect(Collectors.toList());
		//System.out.println(result);
		
		result.forEach(System.out::println);
		
	}

}

@Data
class Product {
	String productName;
	double productPrice;

	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String toString() {
		return productName + ":" + productPrice;
	}
}
