package com.kodilla.good.patterns.challenges.FlightsFinder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightsDirectory {
    private Set<Flight> flights;

    public FlightsDirectory() {
        flights = new HashSet<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getAllFlights() {
        return flights;
    }
}