package com.novak.converter.datamodel;

public class Centimeter extends Length{
    public Centimeter() {
        super("Centimeter");
    }

    {  //done
        addToConversionRatesMap("Inch",0.393701);
        addToConversionRatesMap("Foot",0.0328084);
        addToConversionRatesMap("Milimeter",10);
        addToConversionRatesMap("Meter",0.01);
        addToConversionRatesMap("Kilometer",1e-5);
        addToConversionRatesMap("Yard",0.0109361);
        addToConversionRatesMap("Mile",6.2137e-6);
    }
}
