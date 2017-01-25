package com.erbis.java.cources.yana.lesson11.player;

public class Factory {
	
	private Factory() {
		
	}
	
	public static Player createPlayer() {
		Player player = new Player();
		return player;
	}
	
}
