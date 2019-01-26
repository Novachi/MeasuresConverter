package com.novak.converter.datamodel;

public class Knot extends Speed {
    public Knot() {
        super("Knot");
    }

    {
        addToConversionRatesMap("Miles per hour",1.15078);
        addToConversionRatesMap("Foot per second",1.68781);
        addToConversionRatesMap("Meter per second",0.514444);
        addToConversionRatesMap("Kilometer per hour",1.852);
    }
}
