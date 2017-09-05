package com.erbis.java.courses.max.lesson39;

import com.erbis.java.courses.max.lesson37.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        set.add("first");
        set.add("Second");
        set.add("first");
        set.add("Third");
        set.add("AAAAAAA");
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
