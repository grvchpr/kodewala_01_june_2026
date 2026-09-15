package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<List<String>> cities = Arrays.asList(Arrays.asList("Bangalore", "Chennai"),
				Arrays.asList( "Delhi", "Mumbai", "Kolkata"), 
				Arrays.asList("Hyderabad", "Pune", "Ahmedabad"),
				Arrays.asList( "Nagpur", "Coimbatore"));
		
		List<String> output = cities.stream()
				.flatMap(list ->list.stream())
				.filter(city -> city.startsWith("C"))
				.map(city -> city.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		long count = cities.stream()
				.flatMap(list -> list.stream())
				.filter(city -> city.startsWith("C"))
				.count();
		System.out.println("Count of cities: " + count);
	}
}
