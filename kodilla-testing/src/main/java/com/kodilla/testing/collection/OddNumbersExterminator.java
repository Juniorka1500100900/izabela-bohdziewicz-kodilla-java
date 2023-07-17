package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(List<Integer> numbers) {
       ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(Integer even: numbers) {
            if (even % 2 == 0) {
                evenNumbers.add(even);
            } else {
                System.out.println("Dupa");
            }
        }
        return evenNumbers;
    }
}