package com.gridnine.testing;

import com.gridnine.testing.service.FlightService;
import com.gridnine.testing.service.impl.ArrivalDateBeforeDepartureDateServiceImpl;
import com.gridnine.testing.service.impl.DepartureBeforeThatTimeServiceImpl;
import com.gridnine.testing.service.impl.TimeOnEarthServiceImpl;

public class Main {
    public static void main(String[] args) {
        FlightBuilder flightBuilder = new FlightBuilder();
        System.out.println(flightBuilder.createFlights());

        FlightService service = new DepartureBeforeThatTimeServiceImpl();
        System.out.println(service.filteredFlights(flightBuilder.createFlights()));

        FlightService service1 = new ArrivalDateBeforeDepartureDateServiceImpl();
        System.out.println(service1.filteredFlights(flightBuilder.createFlights()));

        FlightService service2 = new TimeOnEarthServiceImpl();
        System.out.println(service2.filteredFlights(flightBuilder.createFlights()));
}
}