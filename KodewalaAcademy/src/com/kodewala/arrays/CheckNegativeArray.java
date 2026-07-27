package com.kodewala.arrays;

public class CheckNegativeArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, -4, 5 };
		checkNegativeArray(num);

	}

	private static void checkNegativeArray(int[] arr) {
		boolean isNegative = false;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num < 0) {
				isNegative = true;
				break;
			}
		}
		if (isNegative) {
			System.out.println("negative array");
		} else {
			System.out.println("positive array");
		}
	}

}
