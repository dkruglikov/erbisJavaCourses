package com.erbis.java.cources.olga.lesson11.player;

public class PlayerFactory {

	private PlayerFactory() {
	}
	
	public static Player createPlayer(){
		return new Player();
	}
	
}
