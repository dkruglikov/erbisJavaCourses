package com.erbis.java.cources.aleksandra.lesson35;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
	Student a1 = new Student("Колесникова", "Александра", 18);
	Student a2 = new Student("Зимарева", "Яна", 19);
	Student a3 = new Student("Клим", "Ольга", 25);
	Student a4 = new Student("Подтуркин", "Максим", 28);
	Student a5 = new Student("Кругликов", "Дима", 23);
	
	List <Student> students = new ArrayList<>(5);
	students.add(a1);
	students.add(a2);
	students.add(a3);
	students.add(a4);
	students.add(a5);
	
	//Collections.sort(students, new StudentComparator());
	Collections.sort(students);
	
	for (Student student : students) {
		System.out.println(student);
	}
	}
}
