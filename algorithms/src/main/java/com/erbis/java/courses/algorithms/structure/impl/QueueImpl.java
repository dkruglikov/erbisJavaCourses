package com.erbis.java.courses.algorithms.structure.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl<E> implements Queue<E> {

    private QueueElement<E> head;
    private int size;
    private QueueElement<E> tail;
    

    protected QueueElement<E> getHead() {
        return head;
    }
    
    protected void sizeIncrement() {
        size++;
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
//        size++;
        sizeIncrement();
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
	
	protected void insertHead(E element) {
		if (head == null) {
			add(element);
		} else {
			QueueElement<E> oldHead = head;
			head = createElement(element);
			head.setNext(oldHead);
		}
	}

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator(head);    
    }
    
    class QueueIterator implements Iterator<E> {
        
        private QueueElement<E> caret;
        
        QueueIterator(QueueElement<E> caret) {
            this.caret = caret;
        }
     
        @Override
        public boolean hasNext() {
            return caret != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E temp = caret.getValue();
            caret = caret.getNext();
            return temp;
        }

    }
}
