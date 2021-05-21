package com.examples.bootcamp.quantities.quantityTypes;

enum Unit {
    Kilogram(1000, Type.Weight), Gram(1, Type.Weight),
    Metre(1000, Type.Length), Centimetre(10, Type.Length), Millimetre(1, Type.Length);

    private final double scale;
    private Type type;

    Unit(double scale, Type type) {
        this.scale = scale;
        this.type = type;
    }

    double convert(double value, Unit targetUnit) {
        if (!type.equals(targetUnit.type)) throw new IllegalArgumentException("Incompatible units");
        return value * scale / targetUnit.scale;
    }

    enum Type {
        Weight, Length
    }
}
