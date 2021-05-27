package com.examples.bootcamp.movies;

import java.util.function.Function;

public class MovieBookingStrategies {

    static Function<Seat, Seat> nextSeatStrategy(int rows, int columns){
        return (Seat lastBookedSeat) -> {
            int column = lastBookedSeat.getColumn() + 1;
            int row = lastBookedSeat.getRow() + column / columns;
            column = column % columns;
            return new Seat(row, column);
        };
    }

}
