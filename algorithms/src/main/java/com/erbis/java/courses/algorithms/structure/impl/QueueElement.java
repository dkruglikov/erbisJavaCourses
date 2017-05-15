package com.erbis.java.courses.algorithms.structure.impl;

class QueueElement<E> {
	
	private QueueElement<E> next;
	private final E value;
	
	QueueElement(E value) {
		this.value = value;
	}
	
	E getValue() {
		return value;
	}
	
	QueueElement<E> getNext() {
		return next;
	}
	
	void setNext(QueueElement<E> next) {
		this.next = next;
	}
}
