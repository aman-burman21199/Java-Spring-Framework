package com.learn.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record is similar to class; to eliminate verbosity
record Person(String name,int age,Address addr) {};
record Address(String fistLine,String city) {};

@Configuration
public class HelloWorldConfiguration {

	// default name of Bean is name of method
	@Bean
	public String name() {
		return "Aman";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var per = new Person("Ekta",31,new Address("Main Street","London"));
		return per;
	}
	
	@Bean(name = "customBeanName")
	public Address address() {
		var adr = new Address("Baker Street","London");
		return adr;
	}
	
	// If one Bean dependent on another
	@Bean
	public Person person2MethodCall() {
		var per = new Person(name(),age(),address());
		return per;
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Address customBeanName) {
		var per = new Person(name,age,customBeanName);
		return per;
	}
}
