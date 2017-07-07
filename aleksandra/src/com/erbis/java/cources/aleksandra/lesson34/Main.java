package com.erbis.java.cources.aleksandra.lesson34;

import com.erbis.java.cources.aleksandra.lesson34.iterator.MyIterable;
import com.erbis.java.cources.aleksandra.lesson34.iterator.MyIterator;

public class Main {
	public static void main(String[] args) {
		int x[] = {1,3,4,5};
		MyIterator<String> obj = new MyIterator<>(new String[]{"first","second","third"});
		Iterable<String> obj2 = new MyIterable<>(new String[]{"one", "two", "three"});
		
		for (String string : obj2) {
			System.out.println(string);
		}
		
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		for (int el : x) {
			if (el < 0) {
				break;
			}
			System.out.println(el);
		}	
	}
} 