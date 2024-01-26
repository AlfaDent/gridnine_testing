package com.gridnine.testing;

import java.util.List;
@FunctionalInterface
public interface Filter {
    List<Flight> filter(List<Flight> flightList, Object... args);
}
