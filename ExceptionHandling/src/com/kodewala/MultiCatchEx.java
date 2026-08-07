package com.kodewala;

public class MultiCatchEx {

	public static void main(String[] args) {
		try {
			String str = "gourav";
			System.out.println(str.length());
			int age[] = { 18, 20, 29 };
			System.out.println(age[2]);
			int num = 10 / 2;
			System.out.println("Num:" + num);
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Exception handled: " + e);
		}
	}

}
