package com.examples.bootcamp.quantities.quantityGenerics;

public class Unit {
    protected final int scale;

    public Unit(int scale) {
        this.scale = scale;
    }

    double toBaseUnit(double value) {
        return value * scale;
    }

    public double fromBaseUnit(double valueInBaseUnit) {
        return valueInBaseUnit/scale;
    }

}

