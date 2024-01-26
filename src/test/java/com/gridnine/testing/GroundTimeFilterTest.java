package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroundTimeFilterTest {

    @Test
    public void filter() {
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        List<Flight> nullList = Collections.emptyList();
        ArrayList<Segment> segs = new ArrayList<>(List.of(new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
                new Segment(threeDaysFromNow.plusHours(5), threeDaysFromNow.plusHours(6))));
        List<Flight> flightSegments = new ArrayList<>(List.of(new Flight(segs)));
        GroundTimeFilter filter = new GroundTimeFilter();

        Assert.assertEquals(nullList, filter.filter(flightSegments));
    }
}