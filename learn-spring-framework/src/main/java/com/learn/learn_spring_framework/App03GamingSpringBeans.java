package com.learn.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		System.out.println(context.getBean("game"));
		System.out.println(context.getBean("gameRunner"));
		
		context.close();
	}

}
