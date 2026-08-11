package com.kodewala.arraylist1;

import java.util.ArrayList;

public class MinMax {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);

		int max = numbers.get(0);
		int min = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
			if (numbers.get(i) < min) {
				min = numbers.get(i);
			}
		}
		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);

	}

}
