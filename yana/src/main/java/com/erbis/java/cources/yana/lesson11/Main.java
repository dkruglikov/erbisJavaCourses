package com.erbis.java.cources.yana.lesson11;

import com.erbis.java.cources.yana.lesson11.player.Factory;
import com.erbis.java.cources.yana.lesson11.player.Player;

public class Main {
	public static void main (String[] args) {
		Player player0 = Factory.createPlayer();
		player0.play("La - la -la");
		Player player1 = Factory.createPlayer();
		player1.play("Lu - lu - lu");
		Player player2 = Factory.createPlayer();
		player2.play("Bu - bu - bu");
		//System.out.println(Player.getSystemName());
		//System.out.println(Player.test1);
		
	}
}
