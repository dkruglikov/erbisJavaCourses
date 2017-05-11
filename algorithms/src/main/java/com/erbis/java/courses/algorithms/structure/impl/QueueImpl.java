package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

/**
 * Basic queue implementation.
 */
public class QueueImpl implements Queue {

//	private int size;
	private QueueElement head;
//	private QueueElement tail;
	
	@Override
	public int size() {
		if (head == null) {
			return 0;
		} else {
			int counter = 1;
			QueueElement cerret = head;
			while (cerret.getNext() != null) {
				counter++;
				cerret = cerret.getNext();
			}
			return counter;
		}
	}

	@Override
	public boolean isEmpty() {
		// if (head == null) {
		// return true;
		// } else {
		// return false;
		// }
		return head == null;
	}

	@Override
	public void add(Object element) {
		if (head == null) {
			head = new QueueElement(element);
		} else {
			QueueElement cerret = head;
			while (cerret.getNext() != null) {
				cerret = cerret.getNext();
			}
			QueueElement newElement = new QueueElement(element);
			cerret.setNext(newElement);
		}
	}

	@Override
	public void addAll(Queue queue) {
		Object object = queue.poll();
		while (object != null) {
			// this.
			add(object);
			object = queue.poll();
		}
	}

	@Override
	public Object poll() /*throws EmptyQueueException*/ {
		if (head == null) {
			return null;
			/*throw new EmptyQueueException("Queue is empty");*/
		} else {
			Object result = head.getElement();
			head = head.getNext();
			return result;
		}
	}

	@Override
	public boolean contains(Object element) {
		if (head == null) {
			return false;
		} else {
			QueueElement cerret = head;
			do {
				if (cerret.getElement().equals(element)) {
					return true;
				}
				cerret = cerret.getNext();
			} while (cerret != null);
			return false;
		}
	}
}
