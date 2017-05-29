package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements  LinkedList<E> {    
    
    private LinkedListElement<E> first;
    private LinkedListElement<E> next;
    private LinkedListElement<E> previous;
    
    public LinkedListElement<E> getFirst() {
        return first;
    }

    public void setFirst(LinkedListElement<E> first) {
        this.first = first;
    }
    
    @Override
    public void add(E element, int index) {
        LinkedListElement<E> new_element = new LinkedListElement<E>(element);
        LinkedListElement<E> curret = first;
        while (curret != null) {
            if (index >= 0) {
                if (first == null) {
                    first = new_element;
                } else {
                    
                    for (int i = 1; i <= index; i++) {
                        curret = curret.getNext();
                        if (i == index) {
                            new_element.setNext(new_element);
                        }
                    }
                }
            } else {
                throw new IndexOutOfBoundsException("index < 0");
            }
        }
        throw new IndexOutOfBoundsException("index > size");
    }
    
    @Override
    public E get(int index) {
        E rezult = null;
        LinkedListElement<E> curret = first;
        while (curret != null) {
            if (index == 0) {
                return first.getValue();
            } if (index > 0 && index < size()) {
                for (int i = 0; i <= index; i++) {
                    curret = curret.getNext();
                    if (i == index) {
                        rezult = curret.getValue();
                    }
                }
                return rezult;
            } else {
                throw new IndexOutOfBoundsException("index < 0");
            }
        }
        throw new IndexOutOfBoundsException("index > size");
    }
}
