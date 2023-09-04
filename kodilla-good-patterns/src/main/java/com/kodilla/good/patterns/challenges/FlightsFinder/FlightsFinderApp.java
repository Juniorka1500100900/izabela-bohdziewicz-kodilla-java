package com.kodilla.good.patterns.challenges.FlightsFinder;

import java.util.List;

public class FlightsFinderApp {
    public static void main(String[] args) {

        FlightsRetriever flightsRetriever = new FlightsRetriever();
        FlightsDirectory flightsDirectory = flightsRetriever.retrieve();
        FlightSearcher flightSearcher = new FlightSearcher(flightsDirectory);

        String departureAirport = "Warszawa";
        flightSearcher.printFlightsFromDepartureAirport(departureAirport);

        String arrivalAirport = "Goleniów";
        flightSearcher.printFlightsToArrivalAirport(arrivalAirport);

        String fromAirport = "Gdańsk";
        String toAirport = "Goleniów";
        flightSearcher.printTransferFlights(fromAirport, toAirport);
    }
}
