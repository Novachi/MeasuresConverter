package com.novak.converter.datamodel;

public class Milimeter extends Length {
    public Milimeter() {
        super("Milimeter");
    }

     {  //done
        addToConversionRatesMap("Centimeter",0.1);
        addToConversionRatesMap("Foot",0.00328084);
        addToConversionRatesMap("Meter",0.001);
        addToConversionRatesMap("Kilometer",1e-6);
        addToConversionRatesMap("Yard",0.00109361);
        addToConversionRatesMap("Mile",6.2137e-7);
        addToConversionRatesMap("Inch",0.0393701);
    }
}
