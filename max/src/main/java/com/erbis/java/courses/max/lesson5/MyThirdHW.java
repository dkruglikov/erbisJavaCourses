package com.erbis.java.courses.max.lesson5;

public class MyThirdHW {

    public static void main(String args[]) {
        MyThirdHW myThirdHW = new MyThirdHW();
        myThirdHW.printLoopNumber();
        myThirdHW.printSelectiveLoopNumber();
    }

    private void printLoopNumber() {
        System.out.println("The list of loop numbers: ");
        for (int countNumber = 0; countNumber < 10; ++countNumber) {
            switch (countNumber) {
                case 0:
                    countNumber = 0;
                    System.out.println("Zero");
                    break;
                case 1:
                    countNumber = 1;
                    System.out.println("One");
                    break;
                case 2:
                    countNumber = 2;
                    System.out.println("Two");
                    break;
                case 3:
                    countNumber = 3;
                    System.out.println("Three");
                    break;
                case 4:
                    countNumber = 4;
                    System.out.println("Four");
                    break;
                case 5:
                    countNumber = 5;
                    System.out.println("Five");
                    break;
                case 6:
                    countNumber = 6;
                    System.out.println("Six");
                    break;
                case 7:
                    countNumber = 7;
                    System.out.println("Seven");
                    break;
                case 8:
                    countNumber = 8;
                    System.out.println("Eight");
                    break;
                case 9:
                    countNumber = 9;
                    System.out.println("Nine");
                    break;
            }
        }
    }

    private void printSelectiveLoopNumber() {
        int loopNumber = 1;
        while(loopNumber < 8000){
            if (loopNumber%16==0){
                break;
            }
            else {
                System.out.println(loopNumber);
            }
            loopNumber = loopNumber*2;
        }
    }
}
