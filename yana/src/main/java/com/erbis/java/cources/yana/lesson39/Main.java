package com.erbis.java.cources.yana.lesson39;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<>();
        set.add("BBB");
        set.add("CCC");
        set.add("DDDDDDD");
        set.add("EEEEEEE");
        set.add("Hello, my name is Yana!");
        set.add("AAA");
        System.out.println(set.size());
        
        for (String s : set) {
            System.out.println(s);
        }
        
        Collection<String> set1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        set1.add("bBB");
        set1.add("CCC");
        set1.add("dDDDDDD");
        set1.add("EEEEEEE");
        set1.add("Hello, my name is Yana!");
        set1.add("AAA");
        System.out.println(set.size());
        
        for (String s : set1) {
            System.out.println(s);
        }
        
        Collection<String> set2 = new LinkedHashSet<>();
        set2.add("BBB");
        set2.add("CCC");
        set2.add("DDDDDDD");
        set2.add("EEEEEEE");
        set2.add("Hello, my name is Yana!");
        set2.add("AAA");
        System.out.println(set.size());
        
        for (String s : set2) {
            System.out.println(s);
        }
    }

}
