package com.erbis.java.cources.aleksandra.lesson34.iterator;

import java.util.Iterator;

public class MyIterable<T> implements Iterable<T> {
	private final T[] elements;

	public MyIterable(T[] elements) {
		this.elements = elements;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<>(elements);
	}
}