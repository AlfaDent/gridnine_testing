package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class GroundTimeFilter implements Filter{
    private static final Duration maxGroundTime = Duration.ofHours(2);
    @Override
    public List<Flight> filter(List<Flight> flightList, Object... args) {
        return flightList.stream()
                .filter(flight -> !exceedsMaxGroundTime(flight))
                .toList();
    }

    private static boolean exceedsMaxGroundTime(Flight flight) {
        List<Segment> segments = flight.getSegments();
        Duration groundTime = Duration.ZERO;

        for (int i = 0; i < segments.size() - 1; i++) {
            LocalDateTime arrival = segments.get(i).getArrivalDate();
            LocalDateTime departure = segments.get(i + 1).getDepartureDate();

            groundTime = groundTime.plus(Duration.between(arrival, departure));
            if (groundTime.compareTo(maxGroundTime) > 0) {
                return true;
            }
        }

        return false;
    }

}
