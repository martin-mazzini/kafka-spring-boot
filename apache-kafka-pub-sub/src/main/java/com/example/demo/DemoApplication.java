package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class DemoApplication {

	private Logger logger = LoggerFactory.getLogger(DemoApplication.class.getName());



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
