package com.erbis.java.cources.yana.lesson31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<> ();
        Student oldest = maxAge(list);
    }
    
    private static <T extends Person> T maxAge(ArrayList<T> list) {
        int maxAge = -1;
        T result = null;
        for (int i = 0; i < list.size(); i++) {
            T p = list.get(i);
            if (p.getAge() > maxAge) {
                maxAge = p.getAge();
                result = p;
            }
        }
        return result;
    }
}
