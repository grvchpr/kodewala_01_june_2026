package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Delhi", "Mumbai", "Kolkata", "Hyderabad", "Pune", "Ahmedabad",
				"Jaipur", "Lucknow", "Nagpur", "Coimbatore");
		
		List<String> output = cities.stream()
				.filter(city -> city.startsWith("C"))
				.map(city -> city.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
	}
}
