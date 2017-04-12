package com.erbis.java.cources.olga.lesson11.player;

public class Player {
	private static String testStatic = "Ivan";
	private static int maxserialnumber;
	private int serialNumber;
	
	Player() {
		serialNumber = maxserialnumber++;
	}

	public static String getSystemName() {
//		getSerialNumber();
		return "Android";
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public void play(String songName) {
		System.out.println(getSystemName());
		System.out.println(getSerialNumber());
		System.out.println("+++" + songName + "+++");
	}

	public static String getTestStatic() {
		return testStatic;
	}

	public static void setTestStatic(String testStatic) {
		Player.testStatic = testStatic;
	}
	
}
