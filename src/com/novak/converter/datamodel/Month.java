package com.novak.converter.datamodel;

public class Month extends Time {
    public Month() {
        super("Month");
    }

    {
        addToConversionRatesMap("Year",0.0833334);
        addToConversionRatesMap("Week",4.34524);
        addToConversionRatesMap("Minute",43800);
        addToConversionRatesMap("Day",30.4167);
        addToConversionRatesMap("Microsecond",2.628e+12);
        addToConversionRatesMap("Second",2.628e+6);
        addToConversionRatesMap("Hour",730.001);
        addToConversionRatesMap("Nanosecond",2.628e+15);
    }
}
