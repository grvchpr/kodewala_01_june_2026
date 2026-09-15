package com.kodewala.stream.api1;

public class Driver5 {

	public static void main(String[] args) {
		String input = "swiss";
		
		System.out.println("Non repeating character: ");
		
		input.chars()
		.mapToObj(c -> (char)c)
		.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
		.forEach(System.out::println);
		
		System.out.print("First non repeating character: ");
		
		Character output = input.chars()
		.mapToObj(c -> (char)c)
		.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
		.findFirst()
		.get();

		System.out.println(output);

	}

}
