package com.novak.converter.datamodel;

public class Pound extends Mass {
    public Pound() {
        super("Pound");
    }

    {
        addToConversionRatesMap("Gram",453.59237);
        addToConversionRatesMap("Kilogram",0.453592);
        addToConversionRatesMap("Ounce",16);
    }
}