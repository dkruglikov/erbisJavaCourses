package com.erbis.java.cources.olga.lesson8;

public class Lesson8 {

	private static final int INDEX_CONST = 8;
	private String name = "Lesson";
	private int index = INDEX_CONST;

	 public String getName() {
	 String hello = ". Hello!";
	 return name + getIndex() + hello;
	 }

	public void printHelloWorld() {
		System.out.println("Hallo, World!");
	}

	public void printTillHello(String[] texts, int stopCode) {
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
			if (texts[i].equals("Hello")) {
				System.out.println(stopCode);
				return;
				//break; - if we do not want to stop method
			}
		}
	}
	
	public void printName() {
		String name = getName();
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
