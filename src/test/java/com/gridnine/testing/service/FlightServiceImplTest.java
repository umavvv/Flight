package com.gridnine.testing.service;

import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightServiceImplTest {
    private static FlightServiceImpl flightService;
    private static List<Flight> flights;
    private static FlightBuilder flightBuilder;

    @BeforeEach
    void setUp() {
        flightService = new FlightServiceImpl();
        flights = FlightBuilder.createFlights();
    }

    @Test
    void departureBeforeThatTime() {
        List<Flight> flightList = flightService.departureBeforeThatTime(flights);
        assertFalse(flightList.isEmpty());
    }


    @Test
    void arrivalDateBeforeDepartureDate() {
        List<Flight> flightList = flightService.arrivalDateBeforeDepartureDate(flights);
        assertFalse(flightList.isEmpty());
    }

    @Test
    void timeOnEarth() {
        List<Flight> flightList = flightService.timeOnEarth(flights);
        assertFalse(flightList.isEmpty());
    }
}