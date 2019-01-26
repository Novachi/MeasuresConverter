package com.novak.converter.datamodel;

public class Ounce extends Mass {
    public Ounce() {
        super("Ounce");
    }

    {
        addToConversionRatesMap("Gram",28.3495);
        addToConversionRatesMap("Kilogram",0.0283495);
        addToConversionRatesMap("Pound",0.0625);

    }
}
