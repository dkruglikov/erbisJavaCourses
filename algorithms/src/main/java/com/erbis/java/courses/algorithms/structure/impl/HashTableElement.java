package com.erbis.java.courses.algorithms.structure.impl;

public class HashTableElement<V> {
    
    private V value = null;

    V getValue() {
        return value;
    }
    
    HashTableElement(V value) {
        this.value = value;
    }

}
