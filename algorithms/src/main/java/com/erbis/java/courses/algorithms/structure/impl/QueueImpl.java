package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Basic queue implementation.
 * @param <E> element type
 */
public class QueueImpl<E> implements Queue<E> {

	private int size;
	private QueueElement<E> head;
	private QueueElement<E> tail;
	
	protected QueueElement<E> getHead() {
		return head;
	}
	
	protected QueueElement<E> getTail() {
		return tail;
	}

	protected void incrementSize() {
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public void add(E element) {
		QueueElement<E> tail = new QueueElement<>(element);
		if (head == null) {
			head = tail;
		} else {
			this.tail.setNext(tail);
		}
		this.tail = tail;
		size++;
	}

	@Override
	public void addAll(Queue<E> queue) {
		while (!queue.isEmpty()) {
			try {
				add(queue.poll());
			} catch (EmptyQueueException ex) {
				//Should never happen
			}
		}
	}

	@Override
	public E poll() throws EmptyQueueException {
		if (head == null) {
			throw new EmptyQueueException();
		}
		E element = head.getValue();
		head = head.getNext();
		size--;
		return element;
	}

	@Override
	public boolean contains(Object element) {
		QueueElement<E> carret = head;
		while (carret != null) {
			if (Objects.equals(element, carret.getValue())) {
				return true;
			}
			carret = carret.getNext();
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		
		return new Iterator<E>() {
			
			private QueueElement<E> current = head;
			
			@Override
			public boolean hasNext() {
				return current != tail;
			}

			@Override
			public E next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				E result = (E) current;
				current = current.getNext();
				return result;
			}
		};
	}
	
	protected void insertHead(E element) {
		if (head == null) {
			add(element);
		} else {
			QueueElement<E> oldHead = head;
			head = new QueueElement<>(element);
			head.setNext(oldHead);
			size++;
		}	
	}
}