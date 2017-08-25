package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;

import java.util.Objects;

public class HashTableImpl<K, V> implements HashTable<K, V> {
    private static final int SIZE = 100;
    private HashEntry[] table;
    private V value;
    private K key;
    private int hash;

    HashTableImpl(K key, V value) {
        table = new HashEntry[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
        this.value = value;
        this.key = key;
        hash = Math.abs(key.hashCode() % SIZE);
    }

    public V get(Object key) {
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % SIZE;
        }
        if (table[hash] == null) {
            return null;
        } else {
            return (V) table[hash].getValue();
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % SIZE);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % SIZE;
        }
        table[hash] = new HashEntry(key, value);
    }

    @Override
    public boolean equals(Object value) {
        if (value == this) {
            return true;
        }
        if (value == null) {
            return false;
        }
        if (value instanceof HashTableImpl) {
            HashTableImpl newValue = (HashTableImpl) value;
            return Objects.equals(newValue.value, this.value)
                    && (Objects.equals(newValue.key, this.key));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return hash;
    }
}
