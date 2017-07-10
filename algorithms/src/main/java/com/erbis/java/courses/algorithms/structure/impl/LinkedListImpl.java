package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<D> extends QueueImpl<D> implements LinkedList<D> {
	
	private QueueElement<D> getElementOnIndex(int index) throws IndexOutOfBoundsException {
		QueueElement<D> elementTemp = getHead();
		for (int i = 0; i < index; i++) {
			if (elementTemp == null) {
				throw new IndexOutOfBoundsException("Index is bigger than queue size");
			}
			elementTemp = elementTemp.getNext();
		}
		return elementTemp;
	}
	
	public void add(D element, int index) throws IndexOutOfBoundsException {
		QueueElement<D> newElement = new QueueElement<D>(element);
		QueueElement<D> elementOnIndex = getElementOnIndex(index);
		newElement.setNext(elementOnIndex);
		newElement.setPrevious(elementOnIndex.getPrevious());
		elementOnIndex.getPrevious().setNext(newElement);
		elementOnIndex.setPrevious(newElement);
	}
	
	public D get(int index) throws IndexOutOfBoundsException {
		return getElementOnIndex(index).getValue();
	}
}
