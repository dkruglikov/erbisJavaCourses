package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements LinkedList<E> {

	@Override
	public E get(int index) {
		return getElement(index).getValue();		
	}

	@Override
	public void add(E element, int index) {
		QueueElement<E> elementOld = getElement(index);
		QueueElement<E> newElement = new QueueElement<E>(element);
		newElement.setNext(elementOld.getNext());
		elementOld.setNext(newElement);	
		setSize(size() + 1);
	}

	public QueueElement<E> getElement(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		QueueElement<E> element = getTail();

		for (int i = size() - 1; i > index; i--) {
			element = element.getNext();
		}
		return element;		
	}
}