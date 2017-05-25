package com.erbis.java.courses.algorithms.structure.impl;

public class LinkedListElement<E> {
    
    private E value;
    private LinkedListElement<E> next;
    private LinkedListElement<E> previous;

    LinkedListElement(E value) {
        this.value = value;
    }

    E getValue() {
        return value;
    }
    
    LinkedListElement<E> getNext() {
        return next;
    }

    void setNext(LinkedListElement<E> next) {
        this.next = next;
    }

    LinkedListElement<E> getPrevious() {
        return previous;
    }

    void setPrevious(LinkedListElement<E> previous) {
        this.previous = previous;
    }

    
    
}
