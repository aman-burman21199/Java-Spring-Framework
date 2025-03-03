package com.learn.learn_spring_framework.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionExcercise {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(DependencyInjectionExcercise.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		
		context.close();
	}

}
