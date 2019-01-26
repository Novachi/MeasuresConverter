package com.novak.converter.datamodel;

public class Kelvin extends Temperature{
    public Kelvin() {
        super("Kelvin");
    }

    {
        addToConversionRatesMap("Celsius",-273.15);
        addToConversionRatesMap("Fahrenheit",-273.15);
    }
}
