package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "React", "Servlet", "Spring");
		List<String> list2 = Arrays.asList("Java", "Angular", "HTML", "Spring");
		List<String> list3 = list1
				.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println("list3: "+list3);
	}
}
