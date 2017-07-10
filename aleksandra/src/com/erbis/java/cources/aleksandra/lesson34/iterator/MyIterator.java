package com.erbis.java.cources.aleksandra.lesson34.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<E> implements Iterator<E> {
	private final E[] elements;
	private int current;

	public MyIterator(E[] elements) {
		//super();
		this.elements = elements;
	}
	
	public boolean hasNext() {
		return current != elements.length;	
	}
	
	public E next() {
		E result;
		try {
			result = elements[current];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException();
		}
		current++;
		return result;
	}
}