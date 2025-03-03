package com.learn.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
// above is similar to below on current package.
//@ComponentScan("com.learn.learn_spring_framework.examples.a1")
public class SimpleSpringContextLauncher {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		context.close();
	}

}
