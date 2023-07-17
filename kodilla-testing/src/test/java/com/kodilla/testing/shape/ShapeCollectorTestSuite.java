package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @DisplayName("Test: Adding a figure")
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }
    @DisplayName("Test: Removing a figure")
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        //When
        shapeCollector.removeFigure(shape);
        //Then
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }
    @DisplayName("Test: Getting a figure")
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }
    @DisplayName("Test: Showing figures")
    @Test
    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle();
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}