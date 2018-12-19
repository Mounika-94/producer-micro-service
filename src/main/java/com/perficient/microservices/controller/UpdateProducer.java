package com.perficient.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.microservices.model.Client;
import com.perficient.microservices.service.UpdateProducerService;

@RestController
@RequestMapping(value = "/kafka")
public class UpdateProducer {

	@Autowired
	private UpdateProducerService updateProducerService;

	@PostMapping(value = "/updateProducer", consumes = "application/json")
	public void updateProducer(@RequestBody Client client) throws Exception {
		System.out.println("updateProducer() invoked");
		updateProducerService.updateProducer(client);
	}
}
