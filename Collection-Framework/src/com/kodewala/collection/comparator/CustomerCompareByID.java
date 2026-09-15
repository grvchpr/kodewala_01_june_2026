package com.kodewala.collection.comparator;

import java.util.Comparator;

public class CustomerCompareByID implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		int result = Integer.compare(c1.customerId, c2.customerId);
		return result;
	}

}
