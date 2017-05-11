package com.erbis.java.cources.olga.lesson28;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
			try {
				d.setAge(-5);
			} catch (AgeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		System.out.println(d.getAge());
		
		try {
			d.setName("bob");
		} catch (NameException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(d.getName());
	}
}