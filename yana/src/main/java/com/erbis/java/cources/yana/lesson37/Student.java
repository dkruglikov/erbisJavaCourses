package com.erbis.java.cources.yana.lesson37;

public class Student {
    
    private final String name;
    
    Student (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object st) {
        if (this == st) {
            return true;
        }
        if (st == null) {
            return false;
        }
        if (getClass() != st.getClass()) {
            return false;
        }
        Student other = (Student) st;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else {
            if (!name.equals(other.name)) {
            return false;
            }
        return true;
        }
        return false;
    }

}
