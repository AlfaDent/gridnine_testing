package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EarlyDepartureFilterTest {

    @Test
    public void filter() {
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        List<Flight> nullList = Collections.emptyList();
        ArrayList<Segment> segs = new ArrayList<>(List.of(new Segment(threeDaysFromNow.minusDays(6), threeDaysFromNow)));
        List<Flight> flightSegments = new ArrayList<>(List.of(new Flight(segs)));
        EarlyDepartureFilter filter = new EarlyDepartureFilter();

        Assert.assertEquals(nullList, filter.filter(flightSegments));
    }
}