package com.novak.converter.datamodel;

public class Meter extends Length {
    public Meter() {
        super("Meter");
    }

    { //done
        addToConversionRatesMap("Inch",39.3701);
        addToConversionRatesMap("Foot",3.28084);
        addToConversionRatesMap("Milimeter",1000);
        addToConversionRatesMap("Centimeter",100);
        addToConversionRatesMap("Kilometer",0.001);
        addToConversionRatesMap("Yard",1.09361);
        addToConversionRatesMap("Mile",0.000621371);
    }
}
