package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
           String result = secondChallenge.probablyIWillThrowException(2.0, 1.5);
        } catch (Exception e) {
            System.out.println("Wrong numbers!");
        } finally {
            System.out.println("Done.");
        }
    }
}


