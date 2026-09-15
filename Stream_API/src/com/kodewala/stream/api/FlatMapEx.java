package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
		        Arrays.asList("Java", "Spring"),
		        Arrays.asList("Kafka", "Docker"),
		        Arrays.asList("AWS", "Microservices")
		);
		
		List<String> output = list.stream()
		    .flatMap(List::stream)
		    .collect(Collectors.toList());
		
		System.out.println(output);
	}

}
