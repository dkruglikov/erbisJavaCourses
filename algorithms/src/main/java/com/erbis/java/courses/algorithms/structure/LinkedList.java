package com.erbis.java.courses.algorithms.structure;

/**
 * Linked list contract.
 * @author dkruglikov
 * @param <E> element type
 */
public interface LinkedList<E> extends Queue<E> {
	
	/**
	 * Adds element to specified position in list.
	 * @param element element
	 * @param index position
	 * @throws IndexOutOfBoundsException if <code>index</code> &lt; <code>0</code>
	 * or &gt;= {@link #size()} 
	 */
	void add(E element, int index);
	
	/**
	 * Returns element from list by specified position.
	 * @param index position
	 * @return element
	 * @throws IndexOutOfBoundsException if <code>index</code> &lt; <code>0</code>
	 * or &gt;= {@link #size()}
	 */
	E get(int index);
}
