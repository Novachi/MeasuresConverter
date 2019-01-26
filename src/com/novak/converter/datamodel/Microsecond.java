package com.novak.converter.datamodel;

public class Microsecond extends Time {
    public Microsecond() {
        super("Microsecond");
    }

    {
        addToConversionRatesMap("Year",3.171e-14);
        addToConversionRatesMap("Week",1.6534e-12);
        addToConversionRatesMap("Month",3.8052e-13);
        addToConversionRatesMap("Day",1.1574e-11);
        addToConversionRatesMap("Minute",1.6667e-8);
        addToConversionRatesMap("Second",1e-6);
        addToConversionRatesMap("Hour",2.7778e-10);
        addToConversionRatesMap("Nanosecond",1000);
    }

}
