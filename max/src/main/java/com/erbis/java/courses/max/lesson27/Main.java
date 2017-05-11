package com.erbis.java.courses.max.lesson27;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Card card = new Card();
        card.setFlush(Flush.DIAMOND);
        System.out.println(Arrays.toString(Flush.values()));
        Flush var1 = Flush.valueOf("Пика");
        System.out.println(var1);
        System.out.println(card);
    }
}
