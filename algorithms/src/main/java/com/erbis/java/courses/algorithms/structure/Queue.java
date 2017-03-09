package com.erbis.java.courses.algorithms.structure;

/**
 * LIFO queue contract.
 * @author dkruglikov
 */
public interface Queue {
	
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
	void add(String element);
	
	/**
	 * Returns head of queue and removes element from it.
	 * @return head of queue
	 */
	String poll();
}
