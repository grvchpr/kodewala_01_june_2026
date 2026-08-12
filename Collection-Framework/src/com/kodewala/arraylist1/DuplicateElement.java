package com.kodewala.arraylist1;

import java.util.ArrayList;

public class DuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(1);

		System.out.println("Original list: " + list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					System.out.println("Duplicate element found: " + list.get(i));
				}
			}
		}

	}

}
