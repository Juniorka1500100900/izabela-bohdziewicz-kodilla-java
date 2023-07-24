package com.kodilla.stream.array;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int numbers[] = {1,2,10,5,4,89,34,12,3,90,78,5,7,98,32,67,5,9,32,10};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        double averageExpected = 29.65;
        assertEquals(averageExpected, average, 0.01);

    }
}
