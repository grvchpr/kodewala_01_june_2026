package com.kodewala.arrays;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayEx.storeElements();
	}

	private static void storeElements() {
		int marks[] = new int[5];

		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 60;
		marks[4] = 50;

		for (int mark : marks) {
			if (mark >= 70) {
				System.out.println(mark);
			}
		}

		String names[] = new String[5];
		names[0] = "Arun";
		names[1] = "Sarthak";
		names[2] = "Akash";
		names[3] = "Pankaj";
		names[4] = "Rohit";

		for (String nm : names) {
			if (nm.startsWith("A")) {
				System.out.println(nm);
			}
		}
	}

}
