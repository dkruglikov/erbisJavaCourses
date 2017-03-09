package com.erbis.java.courses.algorithms.structure.impl;

class QueueElement {

    private final String value;
    private QueueElement next;

    QueueElement(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    void setNext(QueueElement next) {
        this.next = next;
    }

    QueueElement getNext() {
        return next;
    }
}
