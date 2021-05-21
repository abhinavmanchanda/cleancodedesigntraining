package com.examples.bootcamp.quantities.quantityGenerics;

import static java.lang.Math.abs;

public class Quantity<T extends Unit> {
    private final double value;
    private final T unit;

    public Quantity(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public Quantity<T> add(Quantity<T> another) {
        double valueInBaseUnit = valueInBaseUnit() + another.valueInBaseUnit();
        double valueInCurrentUnit = unit.fromBaseUnit(valueInBaseUnit);
        return new Quantity<>( valueInCurrentUnit, unit);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Quantity quantity = (Quantity) other;
        if(quantity.unit.getClass() != unit.getClass()) return false;
        return areValuesEqualToThousandthUnit(valueInBaseUnit(), quantity.valueInBaseUnit());
    }

    private double valueInBaseUnit() {
        return unit.toBaseUnit(this.value);
    }

    private boolean areValuesEqualToThousandthUnit(double firstValue, double secondValue) {
        return abs(firstValue - secondValue) < .001;
    }

    @Override
    public int hashCode() {
        return (int)(valueInBaseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}