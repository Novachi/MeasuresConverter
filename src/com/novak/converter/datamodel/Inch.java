package com.novak.converter.datamodel;

public class Inch extends Length {
    public Inch() {
        super("Inch");
    }

    { //done
        addToConversionRatesMap("Centimeter",2.54);
        addToConversionRatesMap("Foot",0.08333424);
        addToConversionRatesMap("Milimeter",25.400276352);
        addToConversionRatesMap("Meter",0.025400276352);
        addToConversionRatesMap("Kilometer",2.5400276352e-5);
        addToConversionRatesMap("Yard",0.02777808);
        addToConversionRatesMap("Mile",1.5783e-5);
    }
}
