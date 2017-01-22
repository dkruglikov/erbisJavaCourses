package com.erbis.java.cources.olga.lesson11.player;

public class Player {
	public static String testStatic = "Ivan";
	private static int MAX_SERIAL_NUMBER;
	private int serialNumber;
	
	public Player() {
		serialNumber = MAX_SERIAL_NUMBER++;
	}

	public static String getSystemName(){
//		getSerialNumber();
		return "Android";
	}
	
	public int getSerialNumber(){
		return serialNumber;
	}
	
	public void play(String songName){
		System.out.println(getSystemName());
		System.out.println(getSerialNumber());
		System.out.println("+++" +songName + "+++");
	}
}
