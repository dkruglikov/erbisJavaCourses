package com.erbis.java.courses.algorithms.structure.impl;

/**
 * Queue element implementation.
 * @author dkruglikov
 * @param <E> value type
 */
class QueueElement<E> {
	
	private final E value;
	private QueueElement<E> next;
	private QueueElement<E> previous;
	
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

	QueueElement<E> getPrevious() {
		return previous;
	}

	void setPrevious(QueueElement<E> previous) {
		this.previous = previous;
	}
}
