package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.HashTable;

public class HashTableImpl<V> implements HashTable<V> {

    @Override
    public V get(int key) {
//CHECKSTYLE:OFF
//        HashTableElement<V> current = null;
        for (int i = 0; i <= key; i++) {
            if (i == key) {
                
                return null;
            } else {
                return null;
            }
            
        }
//CHECKSTYLE:ON      
        return null;
    }

    @Override
    public void put(int key, V value) {
        // TODO Auto-generated method stub
        
    }

}
