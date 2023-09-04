package com.kodilla.good.patterns.challenges.FlightsFinder;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    private FlightsDirectory flightsDirectory;

    public FlightSearcher(FlightsDirectory flightsDirectory) {
        this.flightsDirectory = flightsDirectory;
    }

    public List<Flight> findFlightsFromDepartureAirport(String departureAirport) {
        return flightsDirectory.getAllFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equalsIgnoreCase(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToArrivalAirport(String arrivalAirport) {
        return flightsDirectory.getAllFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equalsIgnoreCase(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findTransferFlights(String fromAirport, String toAirport) {
        return flightsDirectory.getAllFlights().stream()
                .filter(firstLeg -> firstLeg.getDepartureAirport().equalsIgnoreCase(fromAirport))
                .filter(firstLeg -> flightsDirectory.getAllFlights().stream()
                        .anyMatch(secondLeg ->
                                secondLeg.getArrivalAirport().equalsIgnoreCase(toAirport)
                                        && !secondLeg.getDepartureAirport().equalsIgnoreCase(fromAirport)))
                .collect(Collectors.toList());
    }

    public void printFlightsFromDepartureAirport(String departureAirport) {
        List<Flight> flights = findFlightsFromDepartureAirport(departureAirport);
        if (!flights.isEmpty()) {
            System.out.println("Flights from " + departureAirport + ":");
            flights.forEach(System.out::println);
        } else {
            System.out.println("No flights found from " + departureAirport + ".");
        }
    }

    public void printFlightsToArrivalAirport(String arrivalAirport) {
        List<Flight> flights = findFlightsToArrivalAirport(arrivalAirport);
        if (!flights.isEmpty()) {
            System.out.println("Flights to " + arrivalAirport + ":");
            flights.forEach(System.out::println);
        } else {
            System.out.println("No flights found to " + arrivalAirport + ".");
        }
    }

    public void printTransferFlights(String fromAirport, String toAirport) {
        List<Flight> flights = findTransferFlights(fromAirport, toAirport);
        if (!flights.isEmpty()) {
            System.out.println("Transfer flights from " + fromAirport + " to " + toAirport + ":");
            flights.forEach(System.out::println);
        } else {
            System.out.println("No transfer flights found from " + fromAirport + " to " + toAirport + ".");
        }
    }
}

