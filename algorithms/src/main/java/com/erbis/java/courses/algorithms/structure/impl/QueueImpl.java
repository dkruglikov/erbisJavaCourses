package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;

    @Override
    public int size() {
        int size = 0;
        QueueElement carret = head;
        if (carret != null) {
            size++;
            carret.getNext();
        }
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
    }

    @Override
    public String poll() {
        return null;
    }

    private QueueElement getLast() {
        QueueElement carret = head;
        while (carret.getNext() != null) {
            carret = carret.getNext();
        }
        return carret;
    }
}
