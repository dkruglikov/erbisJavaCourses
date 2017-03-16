package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;
    private QueueElement tail;
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
            this.tail.setNext(tail);
        }
        this.tail = tail;
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

    public boolean contains(String element) {
        QueueElement carret = head;
        while (carret != null) {
            if (carret.getValue().equals(element)) {
                return true;
            }
            carret = carret.getNext();
        }
        return false;
    }
}
