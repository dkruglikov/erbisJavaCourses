package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;
import com.erbis.java.courses.algorithms.structure.LinkedList;

public class HashTableImpl<K, V> implements HashTable<K, V> {
    private final static int SIZE = 100;
    private HashEntry[] table;

    HashTableImpl() {
        table = new HashEntry[SIZE];
        for (int i = 0; i < SIZE; i++)
            table[i] = null;
    }

    public V get(Object key) {
        int hash = (key.hashCode() % SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash + 1) % SIZE;
        if (table[hash] == null)
            return null;
        else
            return (V) table[hash].getValue();
    }

    public void put(K key, V value) {
        int hash = (key.hashCode() % SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash + 1) % SIZE;
        table[hash] = new HashEntry(key, value);
    }
}
