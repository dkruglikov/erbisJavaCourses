package com.erbis.java.courses.algorithms.structure.impl;

class QueueElement {
	
	private QueueElement next;
	private final Object value;
	
	QueueElement(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
	
	QueueElement getNext() {
		return next;
	}
	
	void setNext(QueueElement next) {
		this.next = next;
	}
}
