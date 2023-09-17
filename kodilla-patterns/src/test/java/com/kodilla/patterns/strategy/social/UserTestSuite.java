package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.social.*;
import com.kodilla.patterns.strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User izka = new ZGeneration("Izka Koliber");
        User karolina = new YGeneration("Karolina Bobek");
        User patrycja = new Millenials("Patrycja Siekierka");

        //When
        String izkaShouldShare = izka.share();
        System.out.println("Izka posts: " + izkaShouldShare);
        String karolinaShouldShare = karolina.share();;
        System.out.println("Karolina posts: " + karolinaShouldShare);
        String patrycjaShouldShare = patrycja.share();
        System.out.println("Patrycja posts: " + patrycjaShouldShare);

        //Then
        assertEquals("Published on Snapchat: This is my ugly face, enjoy!", izkaShouldShare);
        assertEquals("Published on Twitter: I love politics and big boobs.", karolinaShouldShare);
        assertEquals("Published on Facebook: Hello, have a great day!", patrycjaShouldShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User izka = new Millenials("Izka Koliber");

        //When
        String izkaShouldShare = izka.share();
        System.out.println("Izka posts: " + izkaShouldShare);
        izka.setSocialPublisher(new FacebookPublisher());
        izkaShouldShare = izka.share();
        System.out.println("Izka posts: " + izkaShouldShare);

        //Then
        assertEquals("Published on Facebook: Hello, have a great day!", izkaShouldShare);
    }
}
