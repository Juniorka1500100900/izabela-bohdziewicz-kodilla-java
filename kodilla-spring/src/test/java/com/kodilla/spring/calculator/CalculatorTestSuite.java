package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

    @SpringBootTest
    public class CalculatorTestSuite {
        @Test
        void testCalculations() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);
            double a = 13.50;
            double b = 10.50;

            //When
            double result1 = calculator.add(a, b);
            double result2 = calculator.sub(a, b);
            double result3 = calculator.mul(a, b);
            double result4 = calculator.div(a, b);

            //Then
            assertEquals(24.00, result1,0.1);
            assertEquals(3.00, result2,0.1);
            assertEquals(141.75, result3,0.1);
            assertEquals(1.29, result4,0.1);
        }
    }


