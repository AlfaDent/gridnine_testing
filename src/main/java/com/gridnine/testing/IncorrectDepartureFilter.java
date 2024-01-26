package com.gridnine.testing;

import java.util.List;

public class IncorrectDepartureFilter implements Filter{
    @Override
    public List<Flight> filter(List<Flight> flightList, Object... args) {
        return flightList.stream().filter(flight -> flight.getSegments().stream().noneMatch(segment -> segment.getDepartureDate().isAfter(segment.getArrivalDate()))).toList();
    }
}
