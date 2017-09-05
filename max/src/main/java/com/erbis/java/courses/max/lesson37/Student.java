package com.erbis.java.courses.max.lesson37;

import java.util.Objects;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object student) {
        if (student == this) {
            return true;
        }
        if (student == null) {
            return false;
        }
        if (student instanceof Student) {
            return Objects.equals(((Student) student).name, this.name);
        }
        return false;
    }
}
