package com.novak.converter.datamodel;

public class Yard extends Length {

    public Yard() {
        super("Yard");
    }

    {
        addToConversionRatesMap("Inch",36);
        addToConversionRatesMap("Foot",3);
        addToConversionRatesMap("Milimeter",914.4);
        addToConversionRatesMap("Meter",0.9144);
        addToConversionRatesMap("Kilometer",0.0009144);
        addToConversionRatesMap("Centimeter",91.44);
        addToConversionRatesMap("Mile",0.000568182);
    }
}
