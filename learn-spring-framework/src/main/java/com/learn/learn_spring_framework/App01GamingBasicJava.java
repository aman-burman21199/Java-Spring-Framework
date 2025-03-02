package com.learn.learn_spring_framework;

import com.learn.learn_spring_framework.game.GameRunner;
import com.learn.learn_spring_framework.game.MarioGame;
//import com.learn.learn_spring_framework.game.PacmanGame;
//import com.learn.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		
		// changes hade to made because of tight coupling; loose coupling through interface
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
		
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
		
	}

}
