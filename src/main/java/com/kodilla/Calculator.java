package com.kodilla;

public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtracktBFromA(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5, 30);
        System.out.println(result);
    }
}
