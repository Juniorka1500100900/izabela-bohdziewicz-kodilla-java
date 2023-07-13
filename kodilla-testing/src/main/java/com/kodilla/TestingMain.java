package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();
        int addResult = calculator.addAToB(10, 8);
        int subResult = calculator.subtractBFromA(10, 3);
        if (addResult == 18 && subResult == 7) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Zjebałaś!");
        }
    }
}
