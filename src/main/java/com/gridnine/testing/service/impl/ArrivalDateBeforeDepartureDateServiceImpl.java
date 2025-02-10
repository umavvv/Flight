package com.gridnine.testing.service.impl;

import com.gridnine.testing.exception.NotFlightFoundException;
import com.gridnine.testing.model.Flight;
import com.gridnine.testing.service.FlightService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrivalDateBeforeDepartureDateServiceImpl implements FlightService {
    @Override
    public List<Flight> filteredFlights(List<Flight> flights) {
        List<Flight> filteredFlights = flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .collect(Collectors.toList());
        return Optional.of(filteredFlights)
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new NotFlightFoundException("No flights found"));
    }
}
