package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImpl implements Queue {

    private QueueElement head;
    private int size;
    private QueueElement tail;

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
            this.tail.setNext(tail);
        }
        this.tail = tail;
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

//    private QueueElement getLast() {
//        QueueElement carret = head;
//        while (carret.getNext() != null) {
//            carret = carret.getNext();
//        }
//        return carret;
//    }
    
    private boolean conteins(String element) {
        QueueElement carret = head;
        while (carret != null) {
            if (element.equals(carret.getValue())){
                return true;
            }
            carret = carret.getNext();  
        }
        return false;
    }

    @Override
    public void addAll(Queue queue) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(String element) {
        // TODO Auto-generated method stub
        return false;
    }

}
