package com.erbis.java.courses.algorithms.structure.impl;

public class LinkedListElement<E> extends QueueElement<E> {
    
   
    private LinkedListElement<E> next;
    private LinkedListElement<E> previous;
    
    LinkedListElement(E value) {
        super(value);
    }
    
    LinkedListElement<E> getPrevious() {
        return previous;
    }

    void setPrevious(LinkedListElement<E> previous) {
        this.previous = previous;
    }


    public LinkedListElement<E> getNext() {
        return next;
    }

    public void setNext(LinkedListElement<E> next) {
        this.next = next;
    }
    
}
