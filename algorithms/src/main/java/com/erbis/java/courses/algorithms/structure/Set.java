package com.erbis.java.courses.algorithms.structure;

/**
 * Set contract. Represents collection of unique elements.
 * @author dkruglikov
 * @param <E> element type
 */
public interface Set<E> extends Iterable<E> {
	
	/**
	 * Returns set size.
	 * @return size
	 */
	int size();
	
	/**
	 * Checks if set is empty.
	 * @return <code>true</code> if set is empty and <code>false</code> 
	 */
	boolean isEmpty();
	
	/**
	 * Adds element to set and returns if element was added.
	 * @param element element
	 * @return <code>true</code> if set was changed and <code>false</code> otherwise
	 */
	boolean add(E element);
	
	/**
	 * Removes element from set and returns if element was removed.
	 * @param element element
	 * @return <code>true</code> if set was changed and <code>false</code> otherwise
	 */
	boolean remove(Object element);
	
	/**
	 * Checks if set contains element.
	 * @param element element
	 * @return <code>true</code> if set contains element and <code>false</code> otherwise
	 */
	boolean contains(Object element);
}
