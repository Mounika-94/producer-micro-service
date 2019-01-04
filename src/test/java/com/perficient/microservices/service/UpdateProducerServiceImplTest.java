package com.perficient.microservices.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.perficient.microservices.model.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("/applicationContext.xml")
public class UpdateProducerServiceImplTest {

	@Autowired
	private UpdateProducerServiceImpl updateProducerServiceImpl;

	@Autowired
	private KafkaTemplate<String, Client> kafkaTemplate;

	@Test
	public void testUpdateProducer() throws Exception {
	Client client = new Client();
		client.setName("SM");
		client.setStatus("L");
		updateProducerServiceImpl.updateProducer(client);
	}
}
