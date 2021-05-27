package com.examples.bootcamp.movies;

import java.util.ArrayList;
import java.util.function.Function;

public class MovieTheatre {
    private ArrayList<Seat> bookedSeats = new ArrayList<>();
    private final Function<Seat, Seat> seatSelectionStrategy;

    public MovieTheatre(Function<Seat, Seat> seatSelectionStrategy) {
        this.seatSelectionStrategy = seatSelectionStrategy;

    }

    public String allot(){
        Seat newSeat = seatSelectionStrategy.apply(bookedSeats.get(bookedSeats.size()-1));
        bookedSeats.add(newSeat);
        return "R" + (newSeat.getRow() + 1) + "C" + (newSeat.getColumn() + 1);
    }


    public static void main(String[] args) {
        MovieTheatre movieTheatre = new MovieTheatre(MovieBookingStrategies.nextSeatStrategy(10, 10));
    }

}
