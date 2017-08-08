package com.erbis.java.cources.olga.lesson36;

import java.util.ArrayList;
import java.util.Collection;


public class Main {

	public static void main(String[] args) {
		Collection<Apple> apples = new ArrayList<>();
		Apple apple0 = new Apple("Semerinka0");
		apples.add(apple0);
		Apple apple2 = new Apple("John");
		apples.add(apple2);
		
		
		Collection<Pie> pies = new ArrayList<>();
		Pie pie0 = new Pie("Grusha");
		pies.add(pie0);
		
	
		Collection<Fruit> fruits = new ArrayList<>(apples);
		fruits.addAll(pies);
		
		Apple apple1 = new Apple("Semerinka1");
		apples.add(apple1);
		for (Fruit fruit : fruits) {
		System.out.println(fruit.getName());
		}
		Fruit testfruit = new Apple("John");
		System.out.println(fruits.contains(testfruit));
		
		
	}

}
