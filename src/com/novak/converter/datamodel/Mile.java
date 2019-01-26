package com.novak.converter.datamodel;

public class Mile extends Length {
    public Mile() {
        super("Mile");
    }

    { //done
        addToConversionRatesMap("Inch",63360);
        addToConversionRatesMap("Foot",5280);
        addToConversionRatesMap("Milimeter",1.609e+6);
        addToConversionRatesMap("Meter",1609.34);
        addToConversionRatesMap("Kilometer",1.60934);
        addToConversionRatesMap("Yard",1760);
        addToConversionRatesMap("Centimeter",160934);
    }
}
