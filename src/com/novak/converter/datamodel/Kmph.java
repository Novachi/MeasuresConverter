package com.novak.converter.datamodel;

public class Kmph extends Speed {
    public Kmph() {
        super("Kmph");
    }

    {
        addToConversionRatesMap("Miles per hour",0.621371);
        addToConversionRatesMap("Foot per second",0.911344);
        addToConversionRatesMap("Meter per second",0.277778);
        addToConversionRatesMap("Knot",0.539957);
    }
}
