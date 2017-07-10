package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Queue array-based implementation.
 * @author dkruglikov
 * @param <E> element type
 */
public class ArrayQueue<E> implements Queue<E>, Iterable<E> {
	
	private Object[] elements = {};

	@Override
	public Iterator<E> iterator() {
		
		return new Iterator<E>() {
			
			private int current;
			
			@Override
			public boolean hasNext() {
				return current < size();
			}

			@Override
			public E next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				E result = (E) elements[current];
				current++;
				return result;
			}
		};
	}

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void add(E element) {
		Object[] oldElements = elements;
		elements = new Object[oldElements.length + 1];
		//System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
		for (int i = 0; i < oldElements.length; i++) {
			elements[i] = oldElements[i];
		}
		elements[elements.length - 1] = element;
	}

	@Override
	public void addAll(Queue<E> queue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E poll() {
		if (isEmpty()) {
			return null;
		}
		Object element = elements[0];
		Object[] oldElements = elements;
		elements = new Object[oldElements.length - 1];
		//System.arraycopy(oldElements, 1, elements, 0, elements.length);
		for (int i = 1; i < oldElements.length; i++) {
			elements[i - 1] = oldElements[i];
		}
		return (E) element;
	}
	
	@Override
	public boolean contains(Object element) {
		for (Object el : elements) {
			if (Objects.equals(el, element)) {
				return true;
			}
		}
		return false;
	}
}
