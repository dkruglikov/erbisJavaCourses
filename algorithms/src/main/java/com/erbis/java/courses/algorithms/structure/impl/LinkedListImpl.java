package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements LinkedList<E> {

    @Override
    public void add(E element, int index) {
        QueueElement<E> carret = getHead();
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size()) {
            add(element);
        } else {
            for (int i = 0; i < size(); i++) {
                carret = carret.getNext();
                if (i == index) {
                    add(element);
                }
            }
        }
    }

    @Override
    public E get(int index) {
        QueueElement<E> carret = getHead();
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        E elementByOrderNumber = null;
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                elementByOrderNumber = carret.getValue();
                return elementByOrderNumber;
            }
            carret = carret.getNext();
        }
        return elementByOrderNumber;
    }
}
