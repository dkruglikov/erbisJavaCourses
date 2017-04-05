package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;
import java.util.Objects;

/**
 * Queue array-based implementation.
 * 
 * @author dkruglikov
 */
public class ArrayQueue implements Queue {

	private Object[] elements = {};

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void add(Object element) {
		Object[] oldElements = elements;
		elements = new String[oldElements.length + 1];
		// System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
		for (int i = 0; i < oldElements.length; i++) {
			elements[i] = oldElements[i];
		}
		elements[elements.length - 1] = element;
	}

	@Override
	public void addAll(Queue queue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object poll() {
		if (isEmpty()) {
			return null;
		}
		Object element = elements[0];
		Object[] oldElements = elements;
		elements = new Object[oldElements.length - 1];
		// System.arraycopy(oldElements, 1, elements, 0, elements.length);
		for (int i = 1; i < oldElements.length; i++) {
			elements[i - 1] = oldElements[i];
		}
		return element;
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
