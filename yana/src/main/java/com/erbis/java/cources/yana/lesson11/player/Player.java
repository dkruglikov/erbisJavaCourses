package com.erbis.java.cources.yana.lesson11.player;

public class Player {
	public static int test1 = 19;
	private int serialNumber;
	public static int lastNumber = 0;

	public static String getSystemName() {
		return "Android";
	}
	
	Player() {
		serialNumber = lastNumber++;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void play(String songName) {
		System.out.println(getSystemName());
		System.out.println(getSerialNumber());
		System.out.println("+++ " + songName + " +++");
	}
}
