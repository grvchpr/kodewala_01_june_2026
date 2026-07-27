package com.kodewala.string1;

public class StringExp {

	public static void main(String[] args) {
		String text = "swiss";

		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (text.indexOf(c) == text.lastIndexOf(c)) {
				System.out.println("First non-repeating character: " + c);
				//break;
			}
		}
	}

}
