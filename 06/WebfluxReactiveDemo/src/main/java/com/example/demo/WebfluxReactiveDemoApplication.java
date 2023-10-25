package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WebfluxReactiveDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxReactiveDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("running...");

	}
}
