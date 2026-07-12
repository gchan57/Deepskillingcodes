package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class SpringWebApplication {
	private static final Logger LOGGER =
	        LoggerFactory.getLogger(SpringWebApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(SpringWebApplication.class, args);

		    LOGGER.info("Inside main");
	}

}
