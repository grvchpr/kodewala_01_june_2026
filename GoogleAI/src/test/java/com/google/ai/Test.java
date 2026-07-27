package com.google.ai;

public class Test {

	public static void main(String[] args) {
		String GEMINI_API_KEY = System.getenv("GEMINI_API_KEY");
		System.out.println("API Key starts with: " + GEMINI_API_KEY.substring(0, 10) + "...");
	}

}
