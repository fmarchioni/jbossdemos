package com.example.artemisproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ArtemisProducer producer;

	public void run(String... args) {
		producer.send("Hello world!");
		System.out.println("Message sent!");
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
