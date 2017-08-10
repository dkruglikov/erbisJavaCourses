package com.erbis.java.courses.algorithms.structure.impl;

public class HashEntry<K, V> {
    private K key;
    private V value;

    HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
