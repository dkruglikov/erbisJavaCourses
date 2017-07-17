package com.erbis.java.cources.yana.lesson35;

public class Student implements Comparable<Student>{
    private final String surname;
    private final String name;
    private final int age;
    
    public Student (String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }
    
    public String getSurname() throws NullPointerException {
        if (surname == null) {
            throw new NullPointerException("surname is null");
        }
        return surname;
    }
    
    public String getName() throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("name is null");
        }
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public int compareTo(Student std) {
        int compareTemp = surname.compareTo(std.surname);
        if (compareTemp == 0) {
            compareTemp = name.compareTo(std.name);
        }
        return compareTemp;
    }
    
    @Override
    public String toString() {
        return surname + " " + name + " " + age;
    }

}
