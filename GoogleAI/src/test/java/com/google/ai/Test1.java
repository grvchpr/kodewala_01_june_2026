package com.google.ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Test1 {

    public static void main(String[] args) {

        String apiKey = System.getenv("GEMINI_API_KEY");

        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("GEMINI_API_KEY not found");
            return;
        }

        Client client = Client.builder()
                .apiKey(apiKey)
                .build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Write a funny joke about Java developers.",
                        null
                );

        System.out.println(response.text());
    }
}