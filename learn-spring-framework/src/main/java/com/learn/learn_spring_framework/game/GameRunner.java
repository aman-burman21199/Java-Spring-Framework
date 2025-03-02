package com.learn.learn_spring_framework.game;

public class GameRunner {

	// tightly coupled
	/*
	private MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	*/
	
	// loosely coupled
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
		
	public void run() {
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
