package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
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
    public void add(Object element) {
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
    public void addAll(Queue queue) throws EmptyQueueException {
        QueueImpl queue1 = (QueueImpl) queue;
        QueueElement carret;
        carret = queue1.head;
        while ((carret != null)) {
            add(carret.getValue());
            queue1.poll();
            carret = carret.getNext();
        }
    }

    @Override
    public Object poll() throws EmptyQueueException {
        if (head == null) {
            throw new EmptyQueueException("Queue is empty");
        } else {
            Object firstElement = head.getValue();
            head = head.getNext();
            size--;
            return firstElement;
        }
    }

    public boolean contains(Object element) {
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
