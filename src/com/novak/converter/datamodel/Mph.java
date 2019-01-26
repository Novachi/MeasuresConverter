package com.novak.converter.datamodel;

public class Mph extends Speed {
    public Mph() {
        super("Mph");
    }

    {
        addToConversionRatesMap("Foot per second",1.46667);
        addToConversionRatesMap("Kilometer per hour",1.60934);
        addToConversionRatesMap("Meter per second",0.44704);
        addToConversionRatesMap("Knot",0.868976);
    }
}
