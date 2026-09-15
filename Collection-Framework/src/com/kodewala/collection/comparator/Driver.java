package com.kodewala.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Gourav");
		Customer customer2 = new Customer(1002, "Rohit");
		Customer customer3 = new Customer(13, "Mahesh");
		Customer customer4 = new Customer(99, "Suresh");

		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);

		System.out.println("======Before Sorting======");
		for (Customer customer : customers) {
			System.out.println("Customer ID: " + customer.customerId + ", Customer Name: " + customer.customerName);
		}

		System.out.println("======After Sorting======");
		Collections.sort(customers, new CustomerCompareByName());
		for (Customer customer : customers) {
			System.out.println("Customer ID: " + customer.customerId + ", Customer Name: " + customer.customerName);
		}

	}

}
