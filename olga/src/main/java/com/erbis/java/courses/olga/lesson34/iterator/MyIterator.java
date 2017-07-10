package com.erbis.java.courses.olga.lesson34.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.erbis.java.cources.olga.lesson28.AgeException;
import com.erbis.java.cources.olga.lesson28.NameException;

public class MyIterator<E> implements Iterator<E> {
	private final E[] elements;
	private int current;

	public MyIterator(E[] elements) {
		// super();
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		return current < elements.length;
	}

	@Override
	public E next() {
		// try {
		if (current < 0 || current >= elements.length) {
			throw new NoSuchElementException();
		}
		E result = elements[current];
		current++;
		return result;
		// }
		// catch (ArrayIndexOutOfBoundsException x) {
		// throw new NoSuchElementException();
		// }
	}
}
