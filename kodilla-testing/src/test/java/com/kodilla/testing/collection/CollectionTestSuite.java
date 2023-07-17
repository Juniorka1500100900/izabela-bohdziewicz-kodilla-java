package com.kodilla.testing.collection;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("when the list is empty, " +
            "then the method should not return any number")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> emptylist = new ArrayList<Integer>();
        List<Integer> emptyListAfterExtermination = exterminator.exterminate(emptylist);
        System.out.println("Actual arraylist" + emptyListAfterExtermination);

        //Then
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.println("Expected arraylist" + result);
        Assert.assertEquals(result, emptyListAfterExtermination);
    }

    @DisplayName("when the list contains odd and even numbers, " +
            "then the method should return only even numbers")

    @Test
    public void testOddNumbersExterminatorNormalListt() {
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();


        //When
        ArrayList<Integer> fulllist = new ArrayList<Integer>();
        fulllist.add(1);
        fulllist.add(10);
        fulllist.add(4);
        ArrayList<Integer> evennumbersfulllist = exterminator2.exterminate(fulllist);
        System.out.println("Actual arraylist" + evennumbersfulllist);

        //Then
        ArrayList<Integer> result2 = new ArrayList<Integer>();
        result2.add(10);
        result2.add(4);
        System.out.println("Expected arraylist" + result2);
        Assert.assertEquals(result2, evennumbersfulllist);
    }
}