package com.gi.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderClientImpl {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String input) {
		// kafkaTemplate_topic is the TOPIC to which the message will be posted
		kafkaTemplate.send("kafkaTemplate_topic", input);
	}
}
