package com.novak.converter.datamodel;

public class Hour extends Time{
    public Hour() {
        super("Hour");
    }

    {
        addToConversionRatesMap("Year",0.000114155);
        addToConversionRatesMap("Week",0.00595238);
        addToConversionRatesMap("Month",0.00136986);
        addToConversionRatesMap("Day",0.0416667);
        addToConversionRatesMap("Minute",60);
        addToConversionRatesMap("Second",3600);
        addToConversionRatesMap("Microsecond",3.6e+9);
        addToConversionRatesMap("Nanosecond",3.6e+12);
    }
}
