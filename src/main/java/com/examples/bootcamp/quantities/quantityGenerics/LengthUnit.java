package com.examples.bootcamp.quantities.quantityGenerics;

class LengthUnit extends Unit {
    public static final LengthUnit CENTIMETRE = new LengthUnit(1);
    public static final LengthUnit METRE = new LengthUnit(100);

    public LengthUnit(int scale) {
        super(scale);
    }
}
