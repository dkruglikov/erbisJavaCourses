package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl<E> implements Queue<E> {

    private QueueElement<E> head;
    private QueueElement<E> tail;
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
    public void add(E element) {
        QueueElement<E> tail = new QueueElement<>(element);
        if (head == null) {
            head = tail;
        } else {
            this.tail.setNext(tail);
        }
        this.tail = tail;
        size++;
    }

    @Override
    public void addAll(Queue<E> queue) {
        QueueImpl<E> queue1 = (QueueImpl<E>) queue;
        QueueElement<E> carret;
        carret = queue1.head;
        while ((carret != null)) {
            try {
                add(carret.getValue());
                queue1.poll();
                carret = carret.getNext();
            } catch (EmptyQueueException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public E poll() throws EmptyQueueException {
        if (head == null) {
            throw new EmptyQueueException("Queue is empty");
        } else {
            E firstElement = head.getValue();
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

    QueueElement<E> getHead() {
        return head;
    }

    public void increaseSize() {
        size = size() + 1;
    }

    protected void insertHead(E element) {
        if (head == null) {
            add(element);
            increaseSize();
        } else {
            QueueElement<E> oldHead = head;
            head = new QueueElement<>(element);
            head.setNext(oldHead);
            increaseSize();
        }
    }
}
