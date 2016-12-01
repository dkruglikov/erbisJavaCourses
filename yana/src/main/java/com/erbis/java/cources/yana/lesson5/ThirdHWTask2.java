package com.erbis.java.cources.yana.lesson5;

public class ThirdHWTask2 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 8000) {
			if (i % 16 != 0) {
			System.out.println(i);
			i *= 2;
			continue;
			}
		}
	}

}
