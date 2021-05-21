package com.examples.bootcamp.quantities.quantityGenerics;

class WeightUnit extends Unit {
    public static final WeightUnit GRAM = new WeightUnit(1);
    public static final WeightUnit KILOGRAM = new WeightUnit(1000);

    private WeightUnit(int scale) {
        super(scale);
    }

}
