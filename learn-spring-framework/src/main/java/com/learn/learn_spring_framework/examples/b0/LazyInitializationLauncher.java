package com.learn.learn_spring_framework.examples.b0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
// Lazy Initialization
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Lazy Initialization");
		this.classA=classA;
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncher {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class);
		
		System.out.println("Initialzation of Context Completed");
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(ClassB.class));
		
		context.close();
	}

}
