package com.erbis.java.courses.algorithms.structure.impl;

public class QueueElement {

    private String headElement;
    private String previousElement;
    private String element;
    private String nextElement;

    void setPreviousElement(String element) {
        if (!(previousElement==null)&&!(previousElement==headElement)) {
            this.previousElement = element;
        }
    }

    String getPreviousElement() {
        return previousElement;
    }

    void setHeadElement(String element) {
        if (headElement==null)
        this.headElement = element;
    }

    String getHeadElement() {
        return headElement;
    }

    void setElement(String element) {
        this.element = element;
    }

    String getElement() {
        return element;
    }

    void setNextElement(String element) {
        this.nextElement = element;
    }

    String getNextElement(String element) {
        return nextElement;
    }
}
