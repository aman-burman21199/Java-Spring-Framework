package com.learn.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Aman";
	}
	
	@Bean
	public int age() {
		return 25;
	}
}
