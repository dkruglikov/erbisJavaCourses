package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<D> extends QueueImpl<D> implements LinkedList<D> {

	private QueueElement<D> getElementOnIndex(int index) throws IndexOutOfBoundsException {
		QueueElement<D> elementTemp = getHead();
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index is negative");
		}
		for (int i = 0; i < index; i++) {
			if (elementTemp == null) {
				throw new IndexOutOfBoundsException("Index is bigger than queue size");
			}
			elementTemp = elementTemp.getNext();
		}
		if (elementTemp == null) {
			throw new IndexOutOfBoundsException("Element on index is null");
		}
		return elementTemp;
	}

	public void add(D element, int index) throws IndexOutOfBoundsException {
		QueueElement<D> newElement = new QueueElement<D>(element);
		if (isEmpty()) {
			if (index == 0) {
				add(element);
			} else {
				throw new IndexOutOfBoundsException("Queue is empty and index is not null");
			}
		} else {
			if (index == size()) {
				add(element);
			} else {
				QueueElement<D> elementOnIndex = getElementOnIndex(index);
				newElement.setNext(elementOnIndex);
				newElement.setPrevious(elementOnIndex.getPrevious());
				if (elementOnIndex.getPrevious() != null) {
					elementOnIndex.getPrevious().setNext(newElement);
					elementOnIndex.setPrevious(newElement);
				}
			}
		}
	}

	public D get(int index) throws IndexOutOfBoundsException {
		return getElementOnIndex(index).getValue();
	}
}
