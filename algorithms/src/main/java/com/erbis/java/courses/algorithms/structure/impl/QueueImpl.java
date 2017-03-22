package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;
    private int size;
    private QueueElement tail;

    @Override
    public int size() {
//        QueueElement carret = head;
//        while (carret != null) {
//            size++;
//            carret = carret.getNext();
//        }
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
        size++;
        this.tail = tail;
    }

    @Override
    public Object poll() {
        if (head != null) {
            Object result = head.getValue();
            head = head.getNext();
            size--;
            return result;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean contains(Object element) {
        QueueElement carret = head;
        while (carret != null) {
            if (element.equals(carret.getValue())) {
                return true;
            }
            carret = carret.getNext();  
        }
        return false;
    }

    @Override
    public void addAll(Queue queue) {
        QueueImpl queueImpl = (QueueImpl) queue;
        if (tail != null) {
            tail.setNext(queueImpl.head);
            size += queue.size();
        } else {
            head = queueImpl.head;
            size = queue.size();
        }   
    }

}
