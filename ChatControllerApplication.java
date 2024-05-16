
	package com.example.demo;
	import org.springframework.http.ResponseEntity;
	//ChatController.java
	import org.springframework.web.bind.annotation.*;

	@RestController
	public class ChatControllerApplication {

	 @PostMapping("/upload")
	 public ResponseEntity<String> uploadText(@RequestBody String text) {
	     // Process text and store embeddings
	     return ResponseEntity.ok("Text uploaded successfully");
	 }

	 @PostMapping("/chat")
	 public ResponseEntity<String> chat(@RequestBody String message) {
	     // Generate response to user message
	     String response = "Response from backend for message: " + message;
	     return ResponseEntity.ok(response);
	 }
	}



