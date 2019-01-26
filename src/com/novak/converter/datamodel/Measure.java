package com.novak.converter.datamodel;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Measure {
    private String name;
    private Map<String,Double> conversionRates;
    public enum type {
        LENGTH,
        MASS,
        SPEED,
        TIME,
        TEMPERATURE

    }
    private Measure.type measureType;

    public Measure(String name, Measure.type type) {
        this.name = name;
        conversionRates = new LinkedHashMap<String, Double>();
        measureType = type;
    }

    public String getName() {
        return name;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

     public void addToConversionRatesMap(String measure, double rate){
        conversionRates.put(measure,rate);
     }

     public double getRate(String calculateTo){
        return conversionRates.get(calculateTo);
     }

    public type getMeasureType() {
        return measureType;
    }
}
