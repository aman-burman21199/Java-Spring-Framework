package com.learn.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.learn_spring_framework.game.GameRunner;
import com.learn.learn_spring_framework.game.GamingConsole;
import com.learn.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

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
