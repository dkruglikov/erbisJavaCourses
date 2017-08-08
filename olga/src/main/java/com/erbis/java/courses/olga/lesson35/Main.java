package com.erbis.java.courses.olga.lesson35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		List<Student> students = new ArrayList<>(5);
		Student student0 = new Student("Klim", "Olga", 15);
		students.add(student0);
		Student student1 = new Student("Klim", "Alexa", 17);
		students.add(student1);
		Student student2 = new Student("Zymarjova", "Yana", 18);
		students.add(student2);
		Student student3 = new Student("Podturkin", "Max", 19);
		students.add(student3);
		Student student4 = new Student("Kruglikov", "Dima", 18);
		students.add(student4);
		
		Collections.sort(students, new StudentComparator());
		for (Student s : students) {
			  System.out.println(s);
		  }
	}

}
