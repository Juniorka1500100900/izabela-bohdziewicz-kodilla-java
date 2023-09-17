package com.kodilla.patterns.factory.tasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TaskFactoryTestSuite {
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.executeTask(TaskFactory.DRIVING_TASK);
        //Then
        assertEquals("Drive like crazy", drivingTask.getTaskName());

    }
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.executeTask(TaskFactory.PAINTING_TASK);
        //Then
        assertEquals("Paint", paintingTask.getTaskName());

    }
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.executeTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertEquals("Buy on Amazon", shoppingTask.getTaskName());

    }
}