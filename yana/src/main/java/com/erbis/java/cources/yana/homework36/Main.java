package com.erbis.java.cources.yana.homework36;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.SingleSelectionModel;

public class Main {
    
    public static void main(String[] args) {
        Collection<Drum> drums1 = new ArrayList<>();
        drums1.add(new Drum("Bass drum"));
        drums1.add(new Drum("Crash"));
        drums1.add(new Drum("High tom-tom"));
        
        System.out.println("The first collection of drums: ");
        for (Drum dr : drums1) {
            System.out.println(dr.getName());
        }
        
        Collection<Drum> drums2 = new ArrayList<>();
           drums2.add(new Drum("Hi-hat"));
           drums2.add(new Drum("Snare drum"));
           drums2.add(new Drum("Ride"));
           
           System.out.println(" ");
           System.out.println("The second collection of drums: ");
           for (Drum dr : drums2) {
               System.out.println(dr.getName());
           }
           
           System.out.println(" ");
           Collection<Drum> drums3 = new ArrayList<>();
           System.out.println(drums3.addAll(drums1));
           System.out.println("The third collection of drums: ");
           for (Drum dr : drums3) {
               System.out.println(dr.getName());
           }
           
           System.out.println(" ");
           System.out.println(drums3.addAll(drums2));
           System.out.println("The new third collection of drums: ");
           for (Drum dr : drums3) {
               System.out.println(dr.getName());
           }
           
           Drum testContains = new Drum("Ride");
           System.out.println(" ");
           System.out.println("Ride in drums1?: " + drums1.contains(testContains)); //false
           System.out.println("Ride in drums2?: " + drums2.contains(testContains)); //true
           System.out.println("Ride in drums3?: " + drums3.contains(testContains)); //true
           System.out.println("Is drums1 empty?: " + drums1.isEmpty()); //false
           System.out.println("Remove drums1 from drums2: " + drums2.removeAll(drums1)); //false
           System.out.println("Remove drums2 from drums2: " + drums2.removeAll(drums2)); //true
           System.out.println("Is drums2 empty: " + drums2.isEmpty()); //true
           System.out.println("drums1 retain in drums3: " + drums3.retainAll(drums1)); //true
           
           System.out.println(" ");
           System.out.println("The latest third collection of drums: ");
           for (Drum dr : drums3) {
               System.out.println(dr.getName());
           }
           
    }

}
