package com.erbis.java.courses.algorithms.sort;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
//        ShellSort shellSort = new ShellSort();
//        System.out.println(shellSort);
        System.out.println("\n");
        testFish();
    }

    public static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    public static int initialize(int message) {
        System.out.println(message);
        return 0;
    }

    private static void testFish() {
        Fish fish = new Fish(1);
        System.out.println(fish);
    }
}
