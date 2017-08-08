package com.erbis.java.courses.algorithms.structure.impl;

import java.util.Objects;

import com.erbis.java.courses.algorithms.structure.HashTable;
import com.erbis.java.courses.algorithms.structure.LinkedList;

public class HashMap<K, V> implements HashTable<K, V> {

	private static final int HASH_SHIFT = 20;
	private LinkedList<Entry<K, V>>[] buckets = new LinkedList[Integer.MAX_VALUE>>>HASH_SHIFT];

	@Override
	public V get(Object key) {
		int index = getIndex((K) key);
		LinkedList<Entry<K, V>> q1 = buckets[index];
		if (q1 == null) {
			return null;
		}
		if (q1.size() == 1) {
				return q1.get(0).v;
		} else {
			for (int i=0; i < q1.size(); i++) {
				if (Objects.equals(q1.get(i).k, key)) {
					return q1.get(i).v;
				}
			}
		}
		return null;
	}

	@Override
	public void put(K key, V value) {
		int index = getIndex(key);
		LinkedList<Entry<K, V>> q1 = buckets[index];
		if (q1 == null) {
			q1 = new LinkedListImpl<Entry<K, V>>();
			buckets[index] = q1;
		}
		Entry<K, V> e = new Entry<K, V>(key, value);
		if (!q1.contains(e)) {
			q1.add(e);
		}
	}

	private int getIndex(K key) {
//		int index = Math.abs(key.hashCode());
//		if (index < 0) { // handle MIN_VALUE
//			index = 0;
//		}
//		return index;
		return key.hashCode()>>>(HASH_SHIFT+1);
	}

	static class Entry<K, V> {
		K k;
		V v;

		public Entry(K k, V v) {
			super();
			this.k = k;
			this.v = v;
		}

		@Override
		public boolean equals(Object o) {
			if (o == null) {
				return false;
			}
			if (this == o) {
				return true;
			}
			if (!this.getClass().equals(o.getClass())) {
				return false;
			}
			Entry<K, V> otherEntry = (Entry<K, V>) o;
			return Objects.equals(this.k, otherEntry.k) && Objects.equals(this.v, otherEntry.v);
		}

	}
}
