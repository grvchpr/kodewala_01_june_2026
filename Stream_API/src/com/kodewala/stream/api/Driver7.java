package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;

public class Driver7 {
	public static void main(String[] args) {
		List<Integer> salary = Arrays.asList(52000, 25000, 32000, 45000, 38000, 52000, 28000, 65000, 41000, 75000,
				55000, 32000, 65000);
		
		salary.stream()
		.distinct()
		.sorted((a,b)-> b-a)
		.skip(2)
		.limit(1)
		.forEach(System.out::println);
	}
}
