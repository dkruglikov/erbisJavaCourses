package com.erbis.java.courses.algorithms.structure.impl;

class QueueElement {
	
	private QueueElement next;
	private final String value;
	
	QueueElement(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	QueueElement getNext() {
		return next;
	}
	
	void setNext(QueueElement next) {
		this.next = next;
	}
}
