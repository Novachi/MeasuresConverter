package com.novak.converter.datamodel;

public class Fps extends Speed {
    public Fps() {
        super("Fps");
    }

    {
        addToConversionRatesMap("Miles per hour",0.681818);
        addToConversionRatesMap("Kilometer per hour",1.09728);
        addToConversionRatesMap("Meter per second",0.3048);
        addToConversionRatesMap("Knot",0.592484);
    }
}
