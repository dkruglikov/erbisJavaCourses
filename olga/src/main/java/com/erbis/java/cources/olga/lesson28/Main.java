package com.erbis.java.cources.olga.lesson28;

public final class Main {
	private static final int AGE = 5;
	private Main() {
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		try {
			d.setAge(-AGE);
			d.setName("Bob");
			System.out.println(d.getAge());
		} catch (AgeException | NameException ex) {
			throw new IllegalArgumentException(ex);
		} finally {
			System.out.println("Some final action");
		}
		System.out.println(d.getName());
	}
}