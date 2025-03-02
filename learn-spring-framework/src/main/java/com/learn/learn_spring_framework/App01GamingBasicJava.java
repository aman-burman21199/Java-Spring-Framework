package com.learn.learn_spring_framework;

import com.learn.learn_spring_framework.game.GameRunner;
import com.learn.learn_spring_framework.game.MarioGame;
//import com.learn.learn_spring_framework.game.PacmanGame;
//import com.learn.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		// changes had to made because of tight coupling; loose coupling through interface
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
		
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
		
		var game = new MarioGame(); // 1. Object Creation
		var gameRunner = new GameRunner(game); // 2. Object Creation + Wiring of Dependencies
		// game (GamingConsole) is a dependency of GameRunner class and is injected/wired in above code
		
		gameRunner.run();
		
	}

}
