package com.erbis.java.courses.max.lesson11.player;


public class Player {

    public static String instrument = "Guitar";
    private static int serialNumber = 0;

    private Player() {}

    public static String getSystemName() {
        System.out.println();
        return "Android";
    }

    public static int getSerialNumber() {
        serialNumber = serialNumber+1;
        return serialNumber;
    }

    public void play(String songName) {
        System.out.println(getSystemName());
        System.out.println(getSerialNumber());
        System.out.println("+++" + songName + "+++");
    }
}
