package com.novak.converter.datamodel;

public class Minute extends Time {
    public Minute() {
        super("Minute");
    }

    {
        addToConversionRatesMap("Year",1.9026e-6);
        addToConversionRatesMap("Week",9.9206e-5);
        addToConversionRatesMap("Month",2.2831e-5);
        addToConversionRatesMap("Day",0.000694444);
        addToConversionRatesMap("Microsecond",6e+7);
        addToConversionRatesMap("Second",60);
        addToConversionRatesMap("Hour",0.0166667);
        addToConversionRatesMap("Nanosecond",6e+10);
    }

}
