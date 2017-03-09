package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;

import java.util.Collection;

public class QueueImpl extends QueueElement implements Queue {

    private int queueSize;
    private String queue;

    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {
        if (queueSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void add(String element) {
        setHeadElement(element);
        setPreviousElement(element);
        setElement(element);
        element = getNextElement(element);
        queueSize++;
    }

    @Override
    public String poll() {
        String headElement = getHeadElement();
        setPreviousElement(headElement);
        queueSize--;
        setPreviousElement(getElement());
        return headElement;
    }
}
