package com.examples.bootcamp.quantities.quantityTypes;

import static java.lang.Math.abs;

public class Quantity {
    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Quantity add(Quantity quantity) {
        double valueInCurrentUnit = value + quantity.to(unit).value;
        return new Quantity(valueInCurrentUnit, unit);
    }

    public Quantity to(Unit targetUnit) {
        return new Quantity(unit.convert(value, targetUnit), targetUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        double accuracy = .000001;
        return abs(value - quantity.to(this.unit).value) < accuracy;
    }

}

