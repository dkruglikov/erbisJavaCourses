package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;

public class LinkedListImpl<E> extends QueueImpl<E> implements LinkedList<E> {

    @Override
    public void add(E element, int index) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if ((index == 0 && size() > 0)) {
            insertHead(element);
        }
        if (index == size()) {
            add(element);
        }
        if (index < size() && index != 0) {
            QueueElement<E> newElement = new QueueElement<>(element);
            newElement.setNext(getQueueElement(index));
            getQueueElement(index - 1).setNext(newElement);
            increaseSize();

        }
    }

    @Override
    public E get(int index) {
        return getQueueElement(index).getValue();
    }

    private QueueElement<E> getQueueElement(int index) {
        if (index > size() - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        QueueElement<E> carret = getHead();
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                return carret;
            }
            carret = carret.getNext();
        }
        return carret;
    }
}
