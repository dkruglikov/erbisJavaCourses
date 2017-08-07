package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;

@SuppressWarnings({"rawtypes", "unchecked"})
public class HashTableImpl<K, V> implements HashTable<K, V> {

    public static final int SIZE = 100;

    private HashTableElement[] arr = new HashTableElement[SIZE];

    @Override
    public V get(Object object) {
        int index = object.hashCode() % SIZE;
        if (arr[index] != null) {
            HashTableElement<K, V> temp = arr[index];
            while (!object.equals(temp.getKey())) {
                temp = temp.getPrevious();
                if (temp == null) {
                    return null;
                }
            }
            return (V) temp.getValue();
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        int index = key.hashCode() % SIZE;
        if (arr[index] == null) {
            arr[index] = new HashTableElement<>(key, value);
        } else {
            HashTableElement<K, V> temp = arr[index];
            arr[index] = new HashTableElement<>(key, value);
            arr[index].setPrevious(temp);
        } 
        
    }

}
