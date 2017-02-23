package com.erbis.java.courses.algorithms.sort;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        System.out.println(shellSort);
        System.out.println("\n");

        Fish fish = new Fish(5);
        int var0 = initialize(fish.name);
        int var1 = initialize(fish.age);
        int var2 = initialize(fish.weight);
    }

    public static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    public static int initialize(int message) {
        System.out.println(message);
        return 0;
    }
}
