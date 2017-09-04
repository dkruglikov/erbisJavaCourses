package com.erbis.java.courses.algorithms.structure;

/**
 * Hashtable contract interface.
 * @author dkruglikov
 * @param <K> type of keys stored in this hashtable
 * @param <V> type of values stored in this hashtable
 */
public interface HashTable<K, V> extends Iterable<K> {
	
	/**
	 * Returns value by it's key or <code>null</code>
	 * if value not found by key.
	 * @param key key
	 * @return value
	 */
	V get(Object key);
	
	/**
	 * Puts value to hashtable with appropriate key.
	 * @param key key
	 * @param value value
	 */
	void put(K key, V value);

	int size();

}
