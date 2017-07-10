package com.erbis.java.cources.aleksandra.lesson35;

public class Student implements Comparable<Student> {
	private final String surname;
	private final String name;
	private final int age;
	
	public Student(String surname, String name, int age) {
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

	@Override
	public int compareTo(Student stu) {
		int i = surname.compareTo(stu.getSurname());
		if (i == 0) {
			return name.compareTo(stu.getName());
		}
		return i;
	}
	
	@Override
	public String toString() {
		return surname + " " + name + " " + age + " лет";
	}

	public int getAge() {
		return age;
	}
}
