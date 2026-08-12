package com.kodewala.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class AiChatService {

	private final ObjectProvider<ChatModel> chatModelProvider;

	public AiChatService(ObjectProvider<ChatModel> chatModelProvider) {
		this.chatModelProvider = chatModelProvider;
	}

	public String chat(String message) {
		ChatModel chatModel = chatModelProvider.getIfAvailable();
		if (chatModel == null) {
			return "Spring AI is installed, but no OpenAI chat model is configured. Set OPENAI_API_KEY and try again.";
		}

		return ChatClient.builder(chatModel)
				.build()
				.prompt()
				.user(message)
				.call()
				.content();
	}
}
