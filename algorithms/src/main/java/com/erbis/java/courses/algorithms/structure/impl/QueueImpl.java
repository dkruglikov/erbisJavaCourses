package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl<E> implements Queue<E>{

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
        QueueElement<E> tail = new QueueElement<E>(element);
        if (head == null) {
            head = tail;
        } else {
            this.tail.setNext(tail);
        }
        size++;
        this.tail = tail;
    }

    @Override
    public E poll() throws EmptyQueueException  {
        if (head != null) {
            E result = head.getValue();
            head = head.getNext();
            size--;
            return result;
        } else {
            throw new EmptyQueueException("Queue ie epty.");
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
    public void addAll(Queue<E> queue) throws EmptyQueueException {  
        while (queue.size() > 0) {
            add(queue.poll());
        }
    }
}
