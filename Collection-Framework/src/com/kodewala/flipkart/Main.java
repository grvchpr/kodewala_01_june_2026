package com.kodewala.flipkart;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// for maintaining unique products
		Set<Product> productSet = new HashSet<>();

		productSet.add(new Product(101, "MacBook M3", 75000, "Available"));

		productSet.add(new Product(102, "Mobile", 35000, "Available"));

		productSet.add(new Product(103, "Headphones", 5000, "Available"));

		productSet.add(new Product(104, "Keyboard", 2500, "Available"));

		// Duplicate ID
		productSet.add(new Product(105, "MacBook M1", 75000, "Available"));

		// for maintaining unique products in sorted order based on product ID
		Set<Product> treeSet = new TreeSet<Product>();
		treeSet.addAll(productSet);

		Iterator<Product> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			System.out.println(product);
		}
	}
}