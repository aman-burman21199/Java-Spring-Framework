package com.learn.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.learn_spring_framework.game.GameRunner;
import com.learn.learn_spring_framework.game.GamingConsole;
import com.learn.learn_spring_framework.game.PacmanGame;

// In this class we have Spring make those Beans for us.
// You can remove GamingConfiguration class and make Beans in main class itself. Main class would
// become @Configuration class.

/*
@Configuration
class GamingConfiguration2 {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gam = new GameRunner(game);
		return gam;
	}
}

*/

@Configuration
public class App04GamingSpringBeans {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gam = new GameRunner(game);
		return gam;
	}

	public static void main(String[] args) {
		
//		var context = new AnnotationConfigApplicationContext(GamingConfiguration2.class);
		
		// As we removed GamingConfiguration and made this class as Configuration class
		var context = new AnnotationConfigApplicationContext(App04GamingSpringBeans.class);
		
		
		System.out.println(context.getBean("game"));
		System.out.println(context.getBean("gameRunner"));
		
		context.close();
	}

}
