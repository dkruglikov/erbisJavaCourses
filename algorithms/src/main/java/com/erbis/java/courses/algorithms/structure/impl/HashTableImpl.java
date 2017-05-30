package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;
import com.erbis.java.courses.algorithms.structure.LinkedList;

public class HashTableImpl<V> implements HashTable<V> {

	private static final int HUNDRED = 100;
	private LinkedList<HashEntry> hashEntries = new LinkedListImpl<>();
	
	private class Entry {
		private int key;		
		private V value;
		
		Entry(int key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private class HashEntry {
		private int hashKey;		
		private LinkedList<Entry> entries = new LinkedListImpl<>();
		
		HashEntry(Entry entry) {
			hashKey = hash(entry.key);
			entries.add(entry);
		}
	}
	
	@Override
	public V get(int key) {
		LinkedList<Entry> entries = getHashEntry(key).entries;
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
	public void put(int key, V value) {
		HashEntry hashEntry = getHashEntry(key);
		Entry entry = new Entry(key, value);
		if (hashEntry != null) {
			hashEntry.entries.add(entry);
		} else {
			hashEntries.add(new HashEntry(entry));
		}
	}
	
	private HashEntry getHashEntry(int key) {
		int hashKey = hash(key);
		for (int i = 0; i < hashEntries.size(); i++) {
			HashEntry hashEntry = hashEntries.get(i);
			if (hashKey == hashEntry.hashKey) {
				return hashEntry;
			}
		}
		return null;	
	}
	
	private int hash(int code) {
		return code % HUNDRED;
	}
}