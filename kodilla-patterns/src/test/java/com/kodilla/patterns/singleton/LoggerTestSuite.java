package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.INSTANCE;
        logger.log("Sweet Lord, why should I do these tasks on Saturday evening...");
    }

    @Test
    void testLastLog() {
        //Given
        //When
        String myLog = logger.getLastLog();
        System.out.println("Log: [" + myLog + "]");
        //Then
        assertEquals("Sweet Lord, why should I do these tasks on Saturday evening...", myLog);
    }
}

