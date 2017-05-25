package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements  LinkedList<E> {
    
    private int size;
    private LinkedListElement<E> head;
    private LinkedListElement<E> tail;
    
    @Override
    public void add(E element, int index) {
        LinkedListElement<E> tail = new LinkedListElement<E>(element);
        if (head == null) {
            head = tail;
        } else {
            for (int i = 0; i <= index; i++) {
                if (i == index-1) {
                    this.tail.setNext(tail);
                } else {
                    this.tail = tail;
                }
            }
        }
        this.tail = tail;
            
    }
    
    @Override
    public E get(int index) {
        return null;
    }
}
