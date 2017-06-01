package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements  LinkedList<E> {    
    
    protected LinkedListElement<E> createElement(E element) {
        return new LinkedListElement<>(element);
    }
    
    @Override
    public void add(E element, int index) {
        LinkedListElement<E> newElement = new LinkedListElement<E>(element);
        LinkedListElement<E> current = (LinkedListElement<E>) getHead();
        if (index < 0) {
            throw new IndexOutOfBoundsException("index < 0");
        }
        if (index > size()) {
            throw new IndexOutOfBoundsException("index > size");
        } else {
            if (current == null) {
                add(element);
            } else {
                for (int i = 0; i <= index; i++) {
                  if (i == index) {
                      current.setNext(newElement);
                      super.sizeIncrement();
                  }
                  current = (LinkedListElement<E>) current.getNext();
                }
            }
        }       
    }
    
    @Override
    public E get(int index) {
        E result = null;
        LinkedListElement<E> current = (LinkedListElement<E>) getHead();
        if (index < 0) {
            throw new IndexOutOfBoundsException("index < 0");
        } 
        if (index >= size()) {
            throw new IndexOutOfBoundsException("index >= size");
        } else {
            if (index == 0) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("List is empty");
                }
                return current.getValue();
            } else {
                for (int i = 1; i <= index; i++) {
                    current = (LinkedListElement<E>) current.getNext();
                    if (i == index) {
                        result = current.getValue();
                    }
                }
                return result;
            }
         }
    }
}
