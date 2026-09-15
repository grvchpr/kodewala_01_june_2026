package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay", "Bhanu", "Chitra", "Deepak", "Esha", "Arun", "Bhavana", "Chandan",
				"Deepa", "Eshwar");

		Stream<String> inputStream = names.stream();

		Stream<String> filteredStream = inputStream.filter(name -> name.startsWith("B"));

		List<String> name = filteredStream.collect(Collectors.toList());

		System.out.println(name);

		List<String> name1 = names.stream().filter(name2 -> name2.startsWith("C")).collect(Collectors.toList());

		System.out.println(name1);
	}

}
