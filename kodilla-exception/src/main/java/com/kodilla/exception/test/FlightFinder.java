package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Madrid", true);
        airportMap.put("Rome", true);
        airportMap.put("Beijing", false);

        if (airportMap.containsKey(flight.getArrivalAirport())) {
            return airportMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}