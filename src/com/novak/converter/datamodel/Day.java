package com.novak.converter.datamodel;

public class Day extends Time {
    public Day() {
        super("Day");
    }

    {
        addToConversionRatesMap("Year",0.00273973);
        addToConversionRatesMap("Week",0.142857);
        addToConversionRatesMap("Month",0.0328767);
        addToConversionRatesMap("Hour",24);
        addToConversionRatesMap("Minute",1440);
        addToConversionRatesMap("Second",86400);
        addToConversionRatesMap("Microsecond",8.64e+10);
        addToConversionRatesMap("Nanosecond",8.64e+13);
    }
}
