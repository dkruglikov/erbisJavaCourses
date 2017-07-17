package com.erbis.java.cources.yana.lesson36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Apple> apples = new ArrayList<>();
        apples.add(new Apple("Taa"));
        apples.add(new Apple("John"));
        Collection<Pie> pies = new ArrayList<>();
        pies.add(new Pie("Tuu"));
        Collection<Fruit> fruits = new ArrayList<>(apples);
        fruits.addAll(pies);
        apples.add(new Apple("Tee"));
        
        for (Fruit f : fruits) {
            System.out.println(f.getName());
        }
        
        Fruit testFruit = new Apple("John");
        System.out.println(fruits.contains(testFruit));
    }
}
