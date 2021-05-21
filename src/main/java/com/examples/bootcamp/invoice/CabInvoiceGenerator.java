package com.examples.bootcamp.invoice;

import java.util.List;

public class CabInvoiceGenerator {
    public Invoice generate(List<Ride> rides){
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.getDistance() * 10 + ride.getDuration() * 1 + 5;
        }

        return new Invoice(rides.size(), totalFare, totalFare/rides.size());
    }
}

class Ride {
    private double distance;
    private int duration;

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}

class Invoice {
    private int numberOfRides;
    private double totalFare;
    private double averageFarePerRide;

    public Invoice(int numberOfRides, double totalFare, double averageFarePerRide) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = averageFarePerRide;
    }
}