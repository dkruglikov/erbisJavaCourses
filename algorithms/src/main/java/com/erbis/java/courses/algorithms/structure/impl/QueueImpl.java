package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl<E> implements Queue<E> {

    private QueueElement<E> head;
    private int size;
    private QueueElement<E> tail;
    

    public QueueElement<E> getHead() {
        return head;
    }
    
    protected void setSize(int size) {
        this.size = size;
    }

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
        QueueElement<E> tail = createElement(element);
        if (head == null) {
            head = tail;
        } else {
            this.tail.setNext(tail);
        }
        size++;
        this.tail = tail;
    }

    protected QueueElement<E> createElement(E element) {
        return new QueueElement<E>(element);
    }

    @Override
    public E poll() throws EmptyQueueException {
        if (head != null) {
            E result = head.getValue();
            head = head.getNext();
            size--;
            return result;
        } else {
            throw new EmptyQueueException("Queue is empty.");
        }
    }
    
    @Override
    public boolean contains(E element) {
        QueueElement<E> carret = head;
        while (carret != null) {
            if (element.equals(carret.getValue())) {
                return true;
            }
            carret = carret.getNext();  
        }
        return false;
    }

    @Override
    public void addAll(Queue<E> queue) {  
        while (queue.size() > 0) {
            try {
                add(queue.poll());
            } catch (EmptyQueueException e) {
                e.printStackTrace();
            }
        } 
    }
}
