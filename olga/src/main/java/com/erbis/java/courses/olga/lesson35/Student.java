package com.erbis.java.courses.olga.lesson35;

public class Student implements Comparable<Student> {
	private final String surname;
	private final String name;
	private final int age;

	public Student(String surname, String name, int age) {
		super();
		this.surname = surname;
		this.name = name;
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student std) {
		int compareTo = surname.compareTo(std.surname);
		if (compareTo == 0) {
			return name.compareTo(std.name);
		}
		return compareTo;

	}

	@Override
	public String toString() {
		return this.surname + " " + this.name + " " + this.age;
	}

}
