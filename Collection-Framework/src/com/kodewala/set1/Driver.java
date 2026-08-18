package com.kodewala.set1;

import java.util.HashSet;

public class Driver {
	public static void main(String[] args) {
		HashSet<String> products = new HashSet<>();
		products.add("iPhone17");
		products.add("samsuns26");
		products.add("lg32");
		products.add("mac-pro324");

		int hash = "iPhone17".hashCode();
		int spreadHash = hash ^ (hash >>> 16);
		int index = spreadHash & (16 - 1);
		System.out.println("index: " + index);
	}
}
