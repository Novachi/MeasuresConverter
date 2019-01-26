package com.novak.converter.datamodel;

public class Kilometer extends Length {

    public Kilometer() {
        super("Kilometer");
    }

    { //done
        addToConversionRatesMap("Inch",39370.1);
        addToConversionRatesMap("Foot",3280.84);
        addToConversionRatesMap("Milimeter",1e+6);
        addToConversionRatesMap("Meter",1000);
        addToConversionRatesMap("Centimeter",100000);
        addToConversionRatesMap("Yard",1093.61);
        addToConversionRatesMap("Mile",0.621371);
    }
}
