package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList = FlightBuilder.createFlights();
        Filter earlyDepartureFilter = new EarlyDepartureFilter();
        Filter incorrectFilter = new IncorrectDepartureFilter();
        Filter groundTimeFilter = new GroundTimeFilter();

        for (int i = 0; i < flightList.size(); i++) {
            System.out.println("Flight number" + i + flightList.get(i));
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("EarlyDepFilter:");
        List<Flight> flightList1 = earlyDepartureFilter.filter(FlightBuilder.createFlights());
        for (int i = 0; i < flightList1.size(); i++) {
            System.out.println("Flight number" + i + flightList1.get(i));
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("IncorrectDepFilter:");
        List<Flight> flightList2 = incorrectFilter.filter(FlightBuilder.createFlights());
        for (int i = 0; i < flightList2.size(); i++) {
            System.out.println("Flight number" + i + flightList2.get(i));
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("GroundTimeFilter:");
        List<Flight> flightList3 = groundTimeFilter.filter(FlightBuilder.createFlights());
        for (int i = 0; i < flightList3.size(); i++) {
            System.out.println("Flight number" + i + flightList3.get(i));
        }
    }
}