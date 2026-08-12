package com.kodewala.controller;

import com.kodewala.service.AiChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

	private final AiChatService aiChatService;

	public ChatController(AiChatService aiChatService) {
		this.aiChatService = aiChatService;
	}

	@GetMapping
	public String chat(@RequestParam(defaultValue = "Hello! Introduce yourself as a Spring AI assistant.") String message) {
		return aiChatService.chat(message);
	}
}
