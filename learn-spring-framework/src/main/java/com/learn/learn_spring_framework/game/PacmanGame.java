package com.learn.learn_spring_framework.game;

import org.springframework.stereotype.Component;

// Adding @Component will tell Spring to make instances of this class
@Component
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Left");
	}
	public void right() {
		System.out.println("Right");
	}
}
