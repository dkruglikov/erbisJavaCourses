package com.erbis.java.cources.yana.lesson4;

public class Lesson4 {
	public static void main(String[] args) {
		System.out.print("5.5 < 2: ");
		System.out.println(5.5 < 2);
		
		boolean b = (5 / 2) == 2;
		System.out.println(b);
		
		boolean nonB = !b;
		System.out.println(nonB);
		
		//byte var1 = (byte) 0b10000000;
		//System.out.println(var1);
		
		byte var1 = 0;
		byte var2 = (byte) ~var1;
		System.out.println(var2);
		
		System.out.println(methodTrue() && methodFalse());
		
		System.out.println(methodTrue() | methodFalse());
		
		
		System.out.println(methodFalse() && methodTrue());
		
		byte b1 = 0b101;
		byte b2 = 0b110;
		System.out.println(b1 ^ b2);
		
		
	}
	private static boolean methodTrue(){
		System.out.println("Method True");
		return true;
	}
	private static boolean methodFalse(){
		System.out.println("Method False");
		return false;
	}

}
