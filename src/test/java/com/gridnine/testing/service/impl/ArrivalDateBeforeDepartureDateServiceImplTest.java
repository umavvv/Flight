package com.gridnine.testing.service.impl;

import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.model.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrivalDateBeforeDepartureDateServiceImplTest {
    private static ArrivalDateBeforeDepartureDateServiceImpl arrivalDateBeforeDepartureDateService;
    private static List<Flight> flights;
    private static FlightBuilder flightBuilder;

    @BeforeEach
    void setUp() {
        arrivalDateBeforeDepartureDateService = new ArrivalDateBeforeDepartureDateServiceImpl();
        flights = FlightBuilder.createFlights();
    }

    @Test
    void filteredFlights() {
        List<Flight> flightList = arrivalDateBeforeDepartureDateService.filteredFlights(flights);
        assertFalse(flightList.isEmpty());
    }
}