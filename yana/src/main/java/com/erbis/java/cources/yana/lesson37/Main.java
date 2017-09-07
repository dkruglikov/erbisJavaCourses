package com.erbis.java.cources.yana.lesson37;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
        public static void main(String[] args) {
            Map<Student, String> map = new HashMap<>();
 //           Student stud1 = new Student ("Yana");
            map.put(new Student ("Yana"), "Aaa");
            System.out.println(map.get(new Student ("Yana")));
            
            
            SortedMap<String, String> sortedMap = new TreeMap<>();
            if (sortedMap.isEmpty()) {
                System.out.println("Map is empty.");
            } else {
                System.out.println(sortedMap.firstKey());
            }
            
            sortedMap.put("Abc", "1");
            sortedMap.put("Def", "2");
            sortedMap.put("Ghi", "3");
//            sortedMap.put(null, "Ttt");
            
            SortedMap<String, String> newMap = sortedMap.headMap("Def");
            sortedMap.put("Aaa", "0");
//            newMap.clear();
            System.out.println(sortedMap.size());
            
            for (Map.Entry<String, String> e : sortedMap.entrySet()) {
                    System.out.println("Key: " + e.getKey() + ", value: " + e.getValue());
            }
            
        }
}
