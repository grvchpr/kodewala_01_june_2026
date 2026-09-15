package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("One", "Two", "Three", "Four", "One", "Two", "Three");
		Set<String> set = new HashSet<>();
		
		
		list.stream()
		.filter(n->!set.add(n))
		.forEach(e -> System.out.println(e));
	}
}
