package com.examples.bootcamp.invoice;

import java.util.HashMap;

class Ride {
    private double distance;
    private int duration;
    private Type type;

    double fare() {
        return this.distance * type.farePerKm + this.duration * type.farePerMinute + type.bookingCharges;

    }

    enum Type {
        STANDARD(10, 1, 5)
        , PREMIUM(15, 2, 5);

        private final int farePerKm;
        private final int farePerMinute;
        private final int bookingCharges;

        Type(int farePerKm, int farePerMinute, int bookingCharges) {

            this.farePerKm = farePerKm;
            this.farePerMinute = farePerMinute;
            this.bookingCharges = bookingCharges;
        }

    }
}
