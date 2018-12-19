package com.perficient.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.perficient.microservices.model.Client;

@Service("updateStatusService")
public class UpdateProducerServiceImpl implements UpdateProducerService {

	Client updatedClientRecord = null;

	@Autowired
	private KafkaTemplate<String, Client> kafkaTemplate;

	private static final String TOPIC = "Kafka_Example";

	public void updateProducer(Client client) {
		kafkaTemplate.send(TOPIC, new Client(client.getName(), client.getStatus()));
		System.out.println("Published successfully for Name: " + client.getName() + " with Status: " + client.getStatus() );
	}

}
