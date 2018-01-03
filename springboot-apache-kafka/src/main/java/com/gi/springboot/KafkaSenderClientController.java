package com.gi.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSenderClientController {

	@Autowired
	private KafkaSenderClientImpl kafkaSenderClientImpl;

	@RequestMapping(value = "/kafka", method = RequestMethod.GET)
	public ResponseEntity<String> producerMethod(@RequestParam("input") String input) {
		kafkaSenderClientImpl.sendMessage(input);
		return new ResponseEntity<>("Message sent to Kafka Consumer", HttpStatus.OK);
	}
}
