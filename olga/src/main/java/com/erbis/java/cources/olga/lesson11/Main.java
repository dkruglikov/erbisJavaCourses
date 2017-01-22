package com.erbis.java.cources.olga.lesson11;

import com.erbis.java.cources.olga.lesson11.player.Player;

public class Main {

	public static void main(String[] args) {
		Player player0 = new Player();
		Player playerNew = new Player();
		Player playerTest = new Player();
		
		player0.play("Hello");
		playerTest.play("NY");
		playerNew.play("TTT");
//		System.out.println(Player.getSystemName());//for Class, not for object (because of static) 
//		
//		Player.testStatic="Olga";
//		System.out.println(Player.testStatic);
	}

}
