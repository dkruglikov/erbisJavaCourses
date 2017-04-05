package com.erbis.java.courses.algorithms.structure.impl;

public class QueueElement {
	private Object element;
	private QueueElement next;

	public QueueElement(Object element) {
		this.element = element;
	}

	Object getElement() {
		return element;
	}

	void setElement(Object object) {
		this.element = object;
	}

	QueueElement getNext() {
		return next;
	}

	void setNext(QueueElement next) {
		this.next = next;
	}

}
