package com.erbis.java.courses.algorithms.structure.impl;


import com.erbis.java.courses.algorithms.structure.Queue;

/**
 * Basic queue implementation.
 * @param <E> element type
 */
public class QueueImpl<E> implements Queue<E> {

//	private int size;
	private QueueElement<E> head;
//	private QueueElement tail;
	
	protected QueueElement<E> getHead() {
		return head;
	}

	protected void setHead(QueueElement<E> head) {
		this.head = head;
	}

	@Override
	public int size() {
		if (head == null) {
			return 0;
		} else {
			int counter = 1;
			QueueElement<E> cerret = head;
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
	public void add(E element) {
		if (head == null) {
			head = new QueueElement<E>(element);
		} else {
			QueueElement<E> cerret = head;
			while (cerret.getNext() != null) {
				cerret = cerret.getNext();
			}
			QueueElement<E> newElement = new QueueElement<E>(element);
			cerret.setNext(newElement);
		}
	}

	@Override
	public void addAll(Queue<E> queue) {
		E object = queue.poll();
		while (object != null) {
			// this.
			add(object);
			object = queue.poll();
		}
	}

	@Override
	public E poll() /*throws EmptyQueueException*/ {
		if (head == null) {
			return null;
			/*throw new EmptyQueueException("Queue is empty");*/
		} else {
			E result = head.getValue();
			head = head.getNext();
			return result;
		}
	}

	@Override
	public boolean contains(Object element) {
		if (head == null) {
			return false;
		} else {
			QueueElement<E> cerret = head;
			do {
				if (cerret.getValue().equals(element)) {
					return true;
				}
				cerret = cerret.getNext();
			} while (cerret != null);
			return false;
		}
	}
}
