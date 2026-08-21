package com.kodewala.set1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment> {
	String refID;

	public Payment(String refID) {
		super();
		this.refID = refID;
	}

	public int compareTo(Payment p) {
		int result = this.refID.compareTo(p.refID);
		return result;
	}
}

public class Driver {
	public static void main(String[] args) {
		Set<Payment> set = new TreeSet<Payment>();

		Payment p1 = new Payment("ABCD");
		Payment p2 = new Payment("VCNB");
		Payment p3 = new Payment("XVBD");
		Payment p4 = new Payment("NVFJ");

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		Iterator<Payment> it = set.iterator();
		while (it.hasNext()) {
			Payment p = it.next();
			System.out.println(p.refID);
		}
	}
}
