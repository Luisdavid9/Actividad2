package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication( exclude = {JacksonAutoConfiguration.class})
public class DemoApplication {


	public static void main(String[] args) {
		System.out.println("Que viva el guaro hijueputa");
		SpringApplication.run(DemoApplication.class, args);
	}

}
