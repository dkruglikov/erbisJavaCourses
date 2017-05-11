package com.erbis.java.courses.algorithms.structure;


/**
 * LIFO queue contract.
 * 
 * @author dkruglikov
 */
public interface Queue {

	/**
	 * Returns queue size.
	 * 
	 * @return size
	 */
	int size();

	/**
	 * Checks if queue empty.
	 * 
	 * @return <code>true</code> if queue empty and <code>false</code>
	 *         otherwise.
	 */
	boolean isEmpty();

	/**
	 * Adds element to the end of queue.
	 * 
	 * @param element
	 *            element to add
	 */
	void add(Object element);

	/**
	 * Adds all elements from specified queue to this queue.
	 * 
	 * @param queue
	 *            queue to add
	 */
	void addAll(Queue queue);

	/**
	 * Returns head of queue and removes element from it or <code>null</code> if
	 * queue empty.
	 * 
	 * @return head of queue or <code>null</code> if queue empty
	 */
	Object poll() /*throws EmptyQueueException*/;

	/**
	 * Checks if queue contains specified element.
	 * 
	 * @param element
	 *            element
	 * @return <code>true</code> if queue contains element and
	 *         <code>false</code> otherwise
	 */
	boolean contains(Object element);
}
