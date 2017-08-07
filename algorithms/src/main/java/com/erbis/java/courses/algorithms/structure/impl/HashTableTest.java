package com.erbis.java.courses.algorithms.structure.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erbis.java.courses.algorithms.structure.HashTable;

public class HashTableTest {

    @Test
    public void test() {
        HashTable<Long, String> sut = new HashTableImpl<>();
        sut.put(75L, "75");
        sut.put(175L, "175");
        sut.put(275L, "275");
        sut.put(100L, "100");
        sut.put(1000L, "1000");
        assertEquals("1000", sut.get(1000L));
        assertEquals("100", sut.get(100L));
        assertEquals("75", sut.get(75L));
        assertEquals("175", sut.get(175L));
        assertEquals("275", sut.get(275L));
    }

}
