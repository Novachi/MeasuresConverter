package com.novak.converter.datamodel;

public class Year extends Time {
    public Year() {
        super("Year");
    }

    {
        addToConversionRatesMap("Day",365);
        addToConversionRatesMap("Week",52.1429);
        addToConversionRatesMap("Month",12);
        addToConversionRatesMap("Hour",8760);
        addToConversionRatesMap("Minute",525600);
        addToConversionRatesMap("Second",3.154e+7);
        addToConversionRatesMap("Microsecond",3.154e+13);
        addToConversionRatesMap("Nanosecond",3.154e+16);
    }
}
