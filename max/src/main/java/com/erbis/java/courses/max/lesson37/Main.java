package com.erbis.java.courses.max.lesson37;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {
        Map<Student, String> table = new HashMap<Student, String>();
        table.put(new Student("John"), "First");
        table.put(new Student("Mark"), "Second");
        table.put(new Student("Mathew"), "Third");
        System.out.println(table.get(new Student("John")));
//        System.out.println(table.get(null));

    }
}
