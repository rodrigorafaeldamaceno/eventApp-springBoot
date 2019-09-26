package com.eventApp.eventApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EntityScan(basePackages = {"com.eventApp.models"})
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.eventApp.controllers"})
public class EventAppApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EventAppApplication.class, args);
	}

}
