package com.novak.converter.datamodel;

public class Week extends Time {
    public Week() {
        super("Week");
    }

    {
        addToConversionRatesMap("Year",0.0191781);
        addToConversionRatesMap("Second",604800);
        addToConversionRatesMap("Minute",10080);
        addToConversionRatesMap("Day",7);
        addToConversionRatesMap("Microsecond",6.048e+11);
        addToConversionRatesMap("Nanosecond",6.048e+14);
        addToConversionRatesMap("Hour",168);
        addToConversionRatesMap("Month",0.230137-7);
    }
}
