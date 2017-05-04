package com.erbis.java.cources.aleksandra.lesson28;

public class main {

	public static void main(String[] args) {
		Dog d = new Dog();
		try {
			d.setAge(-5);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		try {
			d.setName("jack");
		} catch (NameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(d.getAge());
	}
}
