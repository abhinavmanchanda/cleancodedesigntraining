package com.examples.bootcamp.invoice;

import java.util.List;


public class Invoice {
    private List<Ride> rides;

    public Invoice(List<Ride> rides){
        this.rides = rides;
    }

    private int numberOfRides() {
        return rides.size();
    }

    private double totalFare() {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.fare();
        }
        return totalFare;
    }

    public double averageFarePerRide(){
        return totalFare()/ numberOfRides();
    }

}