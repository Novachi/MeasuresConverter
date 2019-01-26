package com.novak.converter.datamodel;

public class Gram extends Mass {
    public Gram() {
        super("Gram");
    }

    {
        addToConversionRatesMap("Kilogram",0.001);
        addToConversionRatesMap("Pound",0.00220462);
        addToConversionRatesMap("Ounce",0.035274);
    }
}
