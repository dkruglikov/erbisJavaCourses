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
        if (index < 0) {
            throw new IndexOutOfBoundsException("index < 0");
        }
        if (index > size()) {
            throw new IndexOutOfBoundsException("index > size");
        } else {
            if (first == null) {
                first = new_element;
                setSize(size() + 1);
            } else {
                for (int i = 0; i <= index; i++) {
                  curret = curret.getNext();
                  if (i == index) {
                      new_element.setNext(new_element);
                      setSize(size() + 1);
                  }
                }
            }
        }       
    }
    
    @Override
    public E get(int index) {
        E rezult = null;
        LinkedListElement<E> curret = first;
        if (index < 0) {
            throw new IndexOutOfBoundsException("index < 0");
        } 
        if (index >= size()) {
            throw new IndexOutOfBoundsException("index > size");
        } else {
            if (index == 0) {
                if (first == null) {
                    throw new IndexOutOfBoundsException("List is empty");
                }
                return first.getValue();
            } else {
                for (int i = 0; i <= index; i++) {
                    curret = curret.getNext();
                    if (i == index) {
                        rezult = curret.getValue();
                    }
                }
                return rezult;
            }
         }
    }
}
