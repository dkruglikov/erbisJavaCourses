package com.erbis.java.courses.algorithms.structure.impl;

class HashTableElement<K, V> {

    private K key = null;
    private V value = null;
    private HashTableElement<K, V> previous = null;

    HashTableElement(K key, V value) {
        this.key = key;
        this.value = value;
    }

    HashTableElement(K key, V value, HashTableElement<K, V> previous) {
        super();
        this.key = key;
        this.value = value;
        this.previous = previous;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    HashTableElement<K, V> getPrevious() {
        return previous;
    }

    void setPrevious(HashTableElement<K, V> previous) {
        this.previous = previous;
    }

}
