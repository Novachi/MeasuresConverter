package com.novak.converter.datamodel;

public class Kilogram extends Mass {
    public Kilogram() {
        super("Kilogram");
    }

    {
        addToConversionRatesMap("Gram",1000);
        addToConversionRatesMap("Pound",2.20462);
        addToConversionRatesMap("Ounce",35.274);
    }
}
