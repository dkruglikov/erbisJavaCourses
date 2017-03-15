package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;
    private int size;

    @Override
    public int size() {
        QueueElement carret = head;
        while (carret != null) {
            size++;
            carret = carret.getNext();
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
        if (head != null) {
            String result = head.getValue();
            head = head.getNext();
            return result;
        } else {
            return null;
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
