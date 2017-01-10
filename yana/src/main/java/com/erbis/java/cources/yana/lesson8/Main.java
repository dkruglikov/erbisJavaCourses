package com.erbis.java.cources.yana.lesson8;

public class Main {
	public static void main() {
		Lesson8 lesson = new Lesson8();
		System.out.println(lesson.getName());
		System.out.println(lesson.name);
		System.out.println(lesson.index);
		String[] s = new String[] {"Hellow", "End"};
		lesson.printTillHello(s, 10);
		lesson.printName();
		
	}

}
