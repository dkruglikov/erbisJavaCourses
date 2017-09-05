package com.erbis.java.courses.max.lesson37.main;

import java.security.Key;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String args[]) {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("1", "First");
        map.put("2", "Second");
        map.put("3", "Third");
        if (map.isEmpty()) {
            System.out.println("Empty map");
        } else {
            System.out.println(map.firstKey());
        }
        SortedMap head = map.headMap("11");
        map.put("0", "Zero");
        System.out.println(head.size());
        System.out.println(map.size());
        map.put(null, "Fourth");

        for (Map.Entry str : map.entrySet()) {
            System.out.println("Key: " + str.getKey() + ", Value: " + str.getValue());
        }
    }
}
