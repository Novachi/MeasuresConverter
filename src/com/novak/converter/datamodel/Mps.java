package com.novak.converter.datamodel;

public class Mps extends Speed {
    public Mps() {
        super("mps");
    }

    {
        addToConversionRatesMap("Foot per second",3.28084);
        addToConversionRatesMap("Kilometer per hour",3.6);
        addToConversionRatesMap("Miles per hour",2.23694);
        addToConversionRatesMap("Knot",1.94384);
    }
}
