package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "NYC");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println ("You cannot land in this city!");
        } finally {
            System.out.println("Have a good flight!");
        }

    }
}

