package com.erbis.java.cources.aleksandra.lesson36;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		Collection<Apple> apples = new ArrayList<>();
		Collection<Pie> pies = new ArrayList<>();
		apples.add(new Apple("Голд"));
		apples.add(new Apple("John"));
		pies.add(new Pie("Лимонка"));
		Collection<Fruit> fruits =  new ArrayList<>(apples);
		fruits.addAll(pies);
		apples.add(new Apple("Семиренка"));
		for (Fruit fruit : fruits) {
			System.out.println(fruit.getName());
		}
		Fruit testFruit1 = new Apple("John");
		Fruit testFruit2 = new Pie("John");
		Potato testNotFruit = new Potato("John");
		System.out.println(fruits.contains(testFruit1));
		System.out.println(fruits.contains(testFruit2));
		System.out.println(fruits.contains(testNotFruit));
	}
}
