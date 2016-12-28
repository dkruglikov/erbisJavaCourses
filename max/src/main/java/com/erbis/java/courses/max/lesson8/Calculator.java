package com.erbis.java.courses.max.lesson8;

public class Calculator {
    public static double[] values = {1, 12, -5, 45, -7, 45, 55, 89, -37, 5};
    public static String lastOperationName = "";
    public static double resultLastOperation = 0;

    public static void main (String[] args){
        Calculator calculator = new Calculator();
        calculator.getSum(values);
        System.out.print(lastOperationName + " = ");
        System.out.println(resultLastOperation);
        calculator.getSubtraction(values);
        System.out.print(lastOperationName + " = ");
        System.out.println(resultLastOperation);
        calculator.getMultiplication(values);
        System.out.print(lastOperationName + " = ");
        System.out.println(resultLastOperation);
        calculator.getDivision(values);
        System.out.print(lastOperationName + " = ");
        System.out.println(resultLastOperation);
        calculator.getModulus(values);
        System.out.print(lastOperationName + " = ");
        System.out.println(resultLastOperation);
    }

    public void getSum(double[] values){
        double sum = values[0];
        for(int index=1; index<values.length; index++){
            sum = sum + values[index];
            if(index==(values.length-1)){
                resultLastOperation = sum;
            }
        }
        lastOperationName = "Sum";
        return;
    }

    public void getSubtraction(double[] values){
        double subtraction = values[0];
        for(int index=1; index<values.length; index++){
            subtraction = subtraction - values[index];
            if(index==(values.length-1)){
                resultLastOperation = subtraction;
            }
        }
        lastOperationName = "Subtraction";
        return;
    }

    public void getMultiplication(double[] values){
        double multiplication = values[0];
        for(int index=1; index<values.length; index++){
            multiplication = multiplication * values[index];
            if(index==(values.length-1)){
                resultLastOperation = multiplication;
            }
        }
        lastOperationName = "Multiplication";
        return;
    }

    public void getDivision(double[] values){
        double division = values[0];
        for(int index=1; index<values.length; index++){
            division = division / values[index];
            if(index==(values.length-1)){
                resultLastOperation = division;
            }
        }
        lastOperationName = "Division";
        return;
    }

    public void getModulus(double[] values){
        double modulus = values[0];
        for(int index=1; index<values.length; index++){
            modulus = modulus % values[index];
            if(index==(values.length-1)){
                resultLastOperation = modulus;
            }
        }
        lastOperationName = "Modulus";
        return;
    }
}
