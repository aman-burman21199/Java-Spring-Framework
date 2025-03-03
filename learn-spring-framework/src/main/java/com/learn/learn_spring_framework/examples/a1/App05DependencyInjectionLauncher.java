package com.learn.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	// Field injection
//	@Autowired
	Dependency1 dependency1;
	
//	@Autowired
	Dependency2 dependency2;
	
	// Constructor Dependency Injection; @Autowired not mandatory.
//	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("Constructor Dependency Injection");
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}

	// Setter dependency injection
//	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Dependency Injection");
		this.dependency1 = dependency1;
	}

//	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}

	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}
}

@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class App05DependencyInjectionLauncher {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(App05DependencyInjectionLauncher.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(YourBusinessClass.class));
		
		context.close();
	}

}
