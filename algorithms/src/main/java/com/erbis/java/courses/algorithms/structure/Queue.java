package com.erbis.java.courses.algorithms.structure;

/**
 * LIFO queue contract.
 * @author dkruglikov
 * @param <E> element type
 */
public interface Queue<E> {
	
	/**
	 * Returns queue size.
	 * @return size
	 */
	int size();
	
	/**
	 * Checks if queue empty.
	 * @return <code>true</code> if queue empty
	 * and <code>false</code> otherwise.
	 */
	boolean isEmpty();
	
	/**
	 * Adds element to the end of queue.
	 * @param element element to add
	 */
	void add(E element);
	
	/**
	 * Adds all elements from specified queue to this queue.
	 * @param queue queue to add
	 */
	void addAll(Queue<E> queue);
	
	/**
	 * Returns head of queue and removes element from it or <code>null</code>
	 * if queue empty.
	 * @return head of queue or <code>null</code> if queue empty
	 */
	E poll() throws EmptyQueueException;
	
	/**
	 * Checks if queue contains specified element.
	 * @param element element
	 * @return  <code>true</code> if queue contains element
	 * and <code>false</code> otherwise
	 */
	boolean contains(Object element);
}
