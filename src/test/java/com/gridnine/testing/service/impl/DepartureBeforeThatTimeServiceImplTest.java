package com.gridnine.testing.service.impl;

import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartureBeforeThatTimeServiceImplTest {
    private static DepartureBeforeThatTimeServiceImpl departureBeforeThatTimeService;
    private static List<Flight> flights;
    private static FlightBuilder flightBuilder;

    @BeforeEach
    void setUp() {
        departureBeforeThatTimeService = new DepartureBeforeThatTimeServiceImpl();
        flights = FlightBuilder.createFlights();
    }

    @Test
    void filteredFlights() {
        List<Flight> flightList = departureBeforeThatTimeService.filteredFlights(flights);
        assertFalse(flightList.isEmpty());
    }
}