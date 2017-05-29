package com.erbis.java.courses.algorithms.structure;

/**
 * Hashtable contract interface.
 * @author dkruglikov
 * @param <V> type of values stored in this hashtable
 */
public interface HashTable<V> {
	
	/**
	 * Returns value by it's key or <code>null</code>
	 * if value not found by key.
	 * @param key key
	 * @return value
	 */
	V get(int key);
	
	/**
	 * Puts value to hashtable with appropriate key.
	 * @param key key
	 * @param value value
	 */
	void put(int key, V value);
}
