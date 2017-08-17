package com.erbis.java.cources.yana.lesson37;

import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
            Map<Student, String> map = new HashMap<>();
 //           Student stud1 = new Student ("Yana");
            map.put(new Student ("Yana"), "Aaa");
            System.out.println(map.get(new Student ("Yana")));
        }
}
