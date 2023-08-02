package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
            Flight flight = new Flight("Warsaw", "Beijing");
        FlightFinder flightFinder = new FlightFinder();

        try {
            boolean result = flightFinder.findFlight(flight);
            System.out.println("Flight available: "+ result);
        } catch (RouteNotFoundException e) {
            System.out.println ("You cannot land in this city!");
        } finally {
            System.out.println("End");
        }

    }
}

