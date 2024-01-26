package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

public class FlightBuilderTest {

    @Test
    public void createFlights() {
        Assert.assertThrows(AssertionError.class, this::createFlights);
    }
}