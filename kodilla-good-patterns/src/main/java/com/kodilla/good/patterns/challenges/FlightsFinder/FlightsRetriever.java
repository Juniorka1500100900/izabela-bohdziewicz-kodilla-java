package com.kodilla.good.patterns.challenges.FlightsFinder;

public class FlightsRetriever {
    public FlightsDirectory retrieve() {

        Flight flight1 = new Flight("Warszawa", "Poznań");
        Flight flight2 = new Flight("Gdańsk", "Katowice");
        Flight flight3 = new Flight("Katowice", "Goleniów");
        Flight flight4 = new Flight("Katowice", "Kraków");
        Flight flight5 = new Flight("Poznań", "Warszawa");


        FlightsDirectory flightsDirectory = new FlightsDirectory();
        flightsDirectory.addFlight(flight1);
        flightsDirectory.addFlight(flight2);
        flightsDirectory.addFlight(flight3);
        flightsDirectory.addFlight(flight4);
        flightsDirectory.addFlight(flight5);

        return flightsDirectory;

    }
}

