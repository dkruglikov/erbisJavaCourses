package com.erbis.java.cources.olga;

public class lesson8 {

	public String name = "Lesson";
	public int index = 8;

	 public String getName() {
	 String hello = ". Hello!";
	 return name + index + hello;
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
	
	public void printName(){
		String name = getName();
		System.out.println(name);
	}
}
