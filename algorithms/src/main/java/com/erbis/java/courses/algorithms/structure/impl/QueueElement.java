package com.erbis.java.courses.algorithms.structure.impl;

class QueueElement {

    private final Object value;
    private QueueElement next;

    QueueElement(Object value) {
        this.value = value;
    }

    Object getValue() {
        return value;
    }

    void setNext(QueueElement next) {
        this.next = next;
    }

    QueueElement getNext() {
        return next;
    }
}
