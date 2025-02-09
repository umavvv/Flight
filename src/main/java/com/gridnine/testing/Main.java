package com.gridnine.testing;

import com.gridnine.testing.service.FlightService;
import com.gridnine.testing.service.FlightServiceImpl;

public class Main {
    public static void main(String[] args) {
        FlightBuilder flightBuilder = new FlightBuilder();
        FlightService flightService = new FlightServiceImpl();

        System.out.println(flightBuilder.createFlights());

        System.out.println(flightService.departureBeforeThatTime(flightBuilder.createFlights()));

        System.out.println(flightService.arrivalDateBeforeDepartureDate(flightBuilder.createFlights()));

        System.out.println(flightService.timeOnEarth(flightBuilder.createFlights()));
    }
}