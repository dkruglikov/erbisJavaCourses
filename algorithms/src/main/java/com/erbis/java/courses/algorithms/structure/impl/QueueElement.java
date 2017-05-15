package com.erbis.java.courses.algorithms.structure.impl;

public class QueueElement<T> {
	private T element;
	private QueueElement<T> next;

	public QueueElement(T element) {
		this.element = element;
	}

	T getElement() {
		return element;
	}

	void setElement(T object) {
		this.element = object;
	}

	QueueElement<T> getNext() {
		return next;
	}

	void setNext(QueueElement<T> next) {
		this.next = next;
	}

}
