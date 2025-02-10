package com.gridnine.testing.service.impl;

import com.gridnine.testing.model.Flight;
import com.gridnine.testing.service.FlightService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService {

    @Override
    public List<Flight> departureBeforeThatTime(List<Flight> flights) {

        return flights
                .stream()
                .filter(flight -> flight.getSegments()
                        .stream()
                        .allMatch(segment -> segment.getDepartureDate()
                                .isAfter(LocalDateTime.now())))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalDateBeforeDepartureDate(List<Flight> flights) {

        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> timeOnEarth(List<Flight> flights) {

        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch((segment -> !segment.getArrivalDate()
                                .isBefore(segment.getDepartureDate()))))
                .collect(Collectors.toList());
    }
}
