package com.erbis.java.cources.aleksandra.lesson33;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		int a = 558;
		int b = 5;
		System.out.println(Math.abs(a%b));

		long c = 1497357355000l;
		Date date = new Date(c);
		Date date2 = new Date();
		System.out.println(date);
		System.out.println(date2);
	}
}