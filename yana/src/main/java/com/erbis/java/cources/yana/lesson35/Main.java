package com.erbis.java.cources.yana.lesson35;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(5);
        students.add(new Student("Boo", "Baa", 17));
        students.add(new Student("Buu", "Bii", 20));
        students.add(new Student("Bee", "Byy", 30));
        students.add(new Student("Bee", "Btt", 19));
        students.add(new Student("Bpp", "Bll", 57));
        
        Collections.sort(students, new StudentComparator());
        
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
