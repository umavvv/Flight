package com.gridnine.testing.service.impl;

import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeOnEarthServiceImplTest {
    private static TimeOnEarthServiceImpl timeOnEarthService;
    private static List<Flight> flights;
    private static FlightBuilder flightBuilder;

    @BeforeEach
    void setUp() {
        timeOnEarthService = new TimeOnEarthServiceImpl();
        flights = FlightBuilder.createFlights();
    }

    @Test
    void filteredFlights() {
        List<Flight> flightList = timeOnEarthService.filteredFlights(flights);
        assertFalse(flightList.isEmpty());
    }
}