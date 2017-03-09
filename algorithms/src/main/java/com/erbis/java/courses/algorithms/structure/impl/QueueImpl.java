package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(String element) {
        QueueElement tail = new QueueElement(element);
        if (head == null) {
            head = tail;
        } else {
            QueueElement last = getLast();
            last.setNext(tail);
        }
        size++;
    }

    @Override
    public String poll() {
        if (head == null) {
            return null;
        } else {
            String firstElement = head.getValue();
            head = head.getNext();
            size--;
            return firstElement;
        }
    }

    private QueueElement getLast() {
        QueueElement carret = head;
        while (carret.getNext() != null) {
            carret = carret.getNext();
        }
        return carret;
    }
}
