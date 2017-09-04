package com.erbis.java.courses.algorithms.structure.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
	public V get(Object key) {
		LinkedList<Entry> entries = entryList[hash(key.hashCode())];
		if (entries != null) {
			for (int i = 0; i < entries.size(); i++) {
				Entry entry = entries.get(i);
				if (entry.key.equals(key)) {
					return entry.value;
				}
			}
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		LinkedList<Entry> listEntry = entryList[hash(key.hashCode())]; 
		for (int i = 0; i < listEntry.size(); i++) {
			if (listEntry.get(i).key.equals(key)) {
				listEntry.get(i).value = value;
				return;
			}
		}
		Entry entry = new Entry(key, value);
		listEntry.add(entry);
	}

	private int hash(int hashCode) {
		return Math.abs(hashCode) % HUNDRED;
	}

	public int size() {
		int size = 0;
		for (int i = 0; i < HUNDRED; i++) {
			size = size + entryList[i].size();
		}
		return size;
	}

	@Override
	public Iterator<K> iterator() {
		return new HashIterator();
	}

	private final class HashIterator implements Iterator<K> {
		private int nextArrayCoordinate;
		private int nextListCoordinate;

		private HashIterator() {
			nextArrayCoordinate = HUNDRED;
			for (int i = 0; i < HUNDRED; i++) {
				for (int j = 0; j < entryList[i].size(); j++) {
					if (entryList[i].get(j) != null) {
						nextArrayCoordinate = i;
						nextListCoordinate = j;
						break;
					}
				}
			}
		}

		public boolean hasNext() {
			return nextArrayCoordinate != HUNDRED;
		}

		public K next() {
			if (nextArrayCoordinate == HUNDRED) {
				throw new NoSuchElementException();
			}
			K result = entryList[nextArrayCoordinate].get(nextListCoordinate).key;
			if (nextListCoordinate < entryList[nextArrayCoordinate].size() - 1) {
				nextListCoordinate++;
			} else {
				for (; ++nextArrayCoordinate < HUNDRED;) {
					if (entryList[nextArrayCoordinate].size() > 0) {
						nextListCoordinate = 0;
						break;
					}
				}
			}
			return result;
		}
	}

}