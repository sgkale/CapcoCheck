package com.scb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.scb")
public class Dependencycheck2Application {

	public static void main(String[] args) {
		SpringApplication.run(Dependencycheck2Application.class, args);
	}
}
