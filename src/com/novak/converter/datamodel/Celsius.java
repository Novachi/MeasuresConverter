package com.novak.converter.datamodel;

public class Celsius extends Temperature{
    public Celsius() {
        super("Celsius");
    }

    {
        addToConversionRatesMap("Kelvin",273.15);
    }
}
