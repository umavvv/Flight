package com.gridnine.testing.service;

import com.gridnine.testing.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> departureBeforeThatTime(List<Flight> flights);
    List<Flight> arrivalDateBeforeDepartureDate(List<Flight> flights);
    public List<Flight> timeOnEarth(List<Flight> flights);
}
