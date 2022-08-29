package com.example.demo.controller;

import com.example.demo.consumer.MyTopicConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class ConsumerController {

	private MyTopicConsumer myTopicConsumer;

	public ConsumerController(MyTopicConsumer myTopicConsumer) {
		this.myTopicConsumer = myTopicConsumer;
	}


	@GetMapping("/consumer/messages")
	public List<String> getMessages() {
		return myTopicConsumer.getMessages();
	}


}
