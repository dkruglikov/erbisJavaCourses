package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements LinkedList<E> {

	@Override
	public E get(int index) {
		return getElement(index).getValue();		
	}

	@Override
	public void add(E element, int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Incorrect index value");
		}
		if (index == size()) {
			add(element);
		} else if (index == 0 && size() > 0) {
			insertHead(element);
		} else {
			QueueElement<E> newElement = new QueueElement<E>(element);
			QueueElement<E> elementOld = getElement(index);
			QueueElement<E> elementBefore = getElement(index - 1);
			newElement.setNext(elementOld);
			elementBefore.setNext(newElement);	
			incrementSize();
		}
	}

	public QueueElement<E> getElement(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
		}
		QueueElement<E> element = getHead();
		for (int i = 0; i < index; i++) {
			element = element.getNext();
		}		
		return element;		
	}
}