package com.novak.converter.datamodel;

public class Nanosecond extends Time {
    public Nanosecond() {
        super("Nanosecond");
    }

    {
        addToConversionRatesMap("Year",3.171e-17);
        addToConversionRatesMap("Week",1.6534e-15);
        addToConversionRatesMap("Minute",1.6667e-11);
        addToConversionRatesMap("Day",1.1574e-14);
        addToConversionRatesMap("Microsecond",0.001);
        addToConversionRatesMap("Second",1e-9);
        addToConversionRatesMap("Hour",2.7778e-13);
        addToConversionRatesMap("Month",3.8052e-16);
    }
}
