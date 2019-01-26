package com.novak.converter.datamodel;

public class Second extends Time {
    public Second() {
        super("Second");
    }

    {
        addToConversionRatesMap("Year",3.171e-8);
        addToConversionRatesMap("Week",1.6534e-6);
        addToConversionRatesMap("Minute",0.0166667);
        addToConversionRatesMap("Day",1.1574e-5);
        addToConversionRatesMap("Microsecond",1e+6);
        addToConversionRatesMap("Nanosecond",1e+9);
        addToConversionRatesMap("Hour",2.7778e-13);
        addToConversionRatesMap("Month",3.8052e-7);
    }
}
