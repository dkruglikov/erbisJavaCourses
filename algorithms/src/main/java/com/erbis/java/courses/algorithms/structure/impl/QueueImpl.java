package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;
import java.util.Objects;

/**
 * Basic queue implementation.
 */
public class QueueImpl implements Queue {

	private int size;
	private QueueElement head;
	private QueueElement tail;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void add(Object element) {
		QueueElement tail = new QueueElement(element);
		if (head == null) {
			head = tail;
		} else {
			this.tail.setNext(tail);
		}
		this.tail = tail;
		size++;
	}

	@Override
	public void addAll(Queue queue) {
		while (!queue.isEmpty()) {
			add(queue.poll());
		}
	}

	@Override
	public Object poll() {
		if (head == null) {
			return null;
		}
		Object element = head.getValue();
		head = head.getNext();
		size--;
		return element;
	}

	@Override
	public boolean contains(Object element) {
		QueueElement carret = head;
		while (carret != null) {
			if (Objects.equals(element, carret.getValue())) {
				return true;
			}
			carret = carret.getNext();
		}
		return false;
	}
}
