package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ProduceController {

	//	https://www.baeldung.com/spring-kafka
	// USAR CALLBACKS

	//https://stackoverflow.com/questions/62339968/stop-kafkalistener-spring-kafka-consumer-after-it-has-read-all-messages-till suspender
	private KafkaTemplate<String, String> template;


	@Value(value = "${kafka.testTopic}")
	private String testTopic;

	public ProduceController(KafkaTemplate<String, String> template) {
		this.template = template;
	}


	@GetMapping("/produce")
	public void produce(@RequestParam String message) {
		template.send(testTopic, message);
	}
}
