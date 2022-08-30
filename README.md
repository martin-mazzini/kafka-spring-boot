# Kafka with Spring Boot 

Basic implementation of a Kafka producer and consumer, using Spring Boot and Spring Kafka.

## Launch the project

The app expects a Kafka broker to be running on the default port. If you don´t want to install Kafka locally, probably the fastest way to get it running is using Conduktor.
You can download it from here https://www.conduktor.io/download and quickly start a single instance Kafka cluster.

<img width="407" alt="image" src="https://user-images.githubusercontent.com/25701657/187345811-c1075b8f-cd95-41c7-b723-ff97aedd7e06.png">


## Send a message

Execute: 

curl --request POST \
  --url http://localhost:8080/produce/foo

This will send a message to the topic using the KafkaTemplate class (part of Spring Kafka Project)

## Read a message

Execute:

curl --request GET \
  --url http://localhost:8080/consumer/messages
  
  This will return all messages read by a consumer subscribed to the topic, using a consumer created with the annotation @KafkaListener (part of Spring Kafka Project)

