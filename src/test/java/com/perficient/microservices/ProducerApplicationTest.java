package com.perficient.microservices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.perficient.microservices.controller.UpdateProducer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerApplicationTest {

	@Autowired
	private UpdateProducer updateProducer;

	@Test
	public void contextLoads() throws Exception {
		assertThat(updateProducer).isNotNull();
	}

}
