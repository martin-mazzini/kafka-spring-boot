package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.*;

@RestController()
public class ProducerController {


	private KafkaTemplate<String, String> template;


	@Value(value = "${kafka.testTopic}")
	private String testTopic;

	public ProducerController(KafkaTemplate<String, String> template) {
		this.template = template;
	}


	@PostMapping("/produce/{message}")
	public void produce(@PathVariable String message) {
		template.send(testTopic, message);
	}
}
