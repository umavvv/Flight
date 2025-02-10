package com.gridnine.testing.service;

import com.gridnine.testing.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> filteredFlights(List<Flight> flights);
}
