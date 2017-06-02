package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;
import com.erbis.java.courses.algorithms.structure.LinkedList;

public class HashTableImpl<K, V> implements HashTable<K, V> {

	private static final int HUNDRED = 100;
	private LinkedList<Entry>[] entryList = new LinkedList[HUNDRED];
	
	private class Entry {
		private K key;		
		private V value;
		
		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	@Override
	public V get(K key) {
		LinkedList<Entry> entries = entryList[hash(key.hashCode())];
		if (entries != null) {
			for (int i = 0; i < entries.size(); i++) {
				Entry entry = entries.get(i);
				if (key == entry.key) {
					return entry.value;
				}
			}
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		int index = hash(key.hashCode());  
		Entry entry = new Entry(key, value);
		entryList[index].add(entry);
	}
	
	private int hash(int hashCode) {
		return Math.abs(hashCode) % HUNDRED;
	}
}