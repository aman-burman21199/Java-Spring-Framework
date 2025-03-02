package com.learn.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// To understand wiring through Spring
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure the things that we want Spring to manage. 
		// One way is to create a @Configuration class --> HelloWorldConfiguration.java
		// name - @Bean
		
		// 3. Get Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		// Added because of Resource leak warning in line 11
		context.close();
	}

}
