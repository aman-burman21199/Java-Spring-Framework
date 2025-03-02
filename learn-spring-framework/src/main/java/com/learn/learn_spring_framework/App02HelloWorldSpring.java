package com.learn.learn_spring_framework;

import java.util.Arrays;

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
		// default name of Bean is name of method
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("customBeanName"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		
		// Get All Beans
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		// Added because of Resource leak warning in line 11
		context.close();
	}

}
