package com.erbis.java.courses.algorithms.structure.impl;

import java.util.Iterator;

import com.erbis.java.courses.algorithms.structure.HashTable;
import com.erbis.java.courses.algorithms.structure.Set;

public class HashSetImpl<E> implements Set<E> {

	private final Object valueCONST = new Object();
	private HashTable<E, Object> hashTable = new HashTableImpl<>();

	@Override
	public Iterator<E> iterator() {
		return hashTable.iterator();
	}

	@Override
	public int size() {
		return hashTable.size();
	}

	@Override
	public boolean isEmpty() {
		return hashTable.size() == 0;
	}

	@Override
	public boolean add(E element) {
		boolean addElement = (hashTable.get(element) == null);
		hashTable.put(element, valueCONST);
		return addElement;
	}

	@Override
	public boolean remove(Object element) {
		return false;
	}

	@Override
	public boolean contains(Object element) {
		return (hashTable.get(element) != null);
	}
}