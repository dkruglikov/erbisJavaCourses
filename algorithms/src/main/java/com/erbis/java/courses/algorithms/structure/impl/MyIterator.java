package com.erbis.java.courses.algorithms.structure.impl;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {
    private QueueElement<E> carret;

    MyIterator(QueueElement<E> carret) {
        this.carret = carret;
    }


    @Override
    public boolean hasNext() {
        return carret.getNext() != null;
    }

    @Override
    public E next() {
        E tempElement = carret.getValue();
        carret = carret.getNext();
        return tempElement;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
