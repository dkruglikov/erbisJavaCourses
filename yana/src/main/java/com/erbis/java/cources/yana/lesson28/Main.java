package com.erbis.java.cources.yana.lesson28;



public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
//       dog.setAge(-5);
//        try {
//            dog.setAge(-5);
//        } 
//        catch (IllegalArgumentException exception) {
//            System.out.println(exception.getMessage());
//        }
//        catch (RuntimeException ex) {
//            System.out.println("Unexpected error");
//        }
//        System.out.println(dog.getAge());
//        try {
//            throw new AgeException();
            
//        } catch (AgeException ex) {
//            System.out.println("Age is " + age);
//        }
//        setAge(age) throws AgeException {
//            System.out.println(ex.getMessage());
//        }
        try {
            dog.setName("yana");
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
