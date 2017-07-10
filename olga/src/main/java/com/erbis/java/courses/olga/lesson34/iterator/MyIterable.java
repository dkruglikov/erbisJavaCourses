package com.erbis.java.courses.olga.lesson34.iterator;

import java.util.Iterator;

public class MyIterable<D> implements Iterable<D> {
	private final D[] elements;

	  public MyIterable(D[] elements) {
	   //super();
	   this.elements = elements;
	  }

	@Override
	public Iterator<D> iterator() {
		MyIterator<D> iterator = new MyIterator<>(elements);
		return iterator;
	}
	  
	
}
