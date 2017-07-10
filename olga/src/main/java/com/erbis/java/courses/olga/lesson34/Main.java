package com.erbis.java.courses.olga.lesson34;

import com.erbis.java.courses.olga.lesson34.iterator.MyIterable;
import com.erbis.java.courses.olga.lesson34.iterator.MyIterator;

public class Main {

	  public static void main(String[] args) {
	   int[] x={1,3,4,5};
	   for (int el : x) {
	    if (el<0) {
	     break;
	    }
	    System.out.println(el);
	   } 
	   
	  String[] s = {"test1", "test2", "test3"};
	  MyIterator iterator = new MyIterator(s);
	  while (iterator.hasNext()) {
		 System.out.println(iterator.next());  
	  }
	   
	   String[] s2 = {"test11", "test22", "test33"};
		  Iterable<String> iterable = new MyIterable<>(s2);
		  for (String element : iterable) {
			  System.out.println(element);
		  }
	  }
	 }