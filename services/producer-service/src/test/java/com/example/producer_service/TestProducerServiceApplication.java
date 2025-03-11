package com.example.producer_service;

import org.springframework.boot.SpringApplication;

public class TestProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProducerServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
