package com.google.ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Main {

	public static void main(String[] args) {

		String apiKey = System.getenv("GEMINI_API_KEY");

		System.out.println("Key prefix: " + apiKey.substring(0, 8));

		Client client = Client.builder().apiKey(apiKey).build();

		GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash",
				"Say hello in one sentence.", null);

		System.out.println(response.text());
	}
}