package com.novak.converter.datamodel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainModel {
    private static Map<String,Length> lengths = new HashMap<>();
    private static Map<String,Mass> mass = new HashMap<>();
    private static Map<String,Speed> speed = new HashMap<>();
    private static Map<String,Time> time = new HashMap<>();
    private static Map<String,Temperature> temperature = new HashMap<>();

    static {
        lengths.put("Inch",new Inch());
        lengths.put("Centimeter",new Centimeter());
        lengths.put("Milimeter",new Milimeter());
        lengths.put("Foot", new Foot());
        lengths.put("Kilometer", new Kilometer());
        lengths.put("Meter", new Meter());
        lengths.put("Mile", new Mile());
        lengths.put("Yard", new Yard());

        temperature.put("Celsius",new Celsius());
        temperature.put("Fahrenheit",new Fahrenheit());
        temperature.put("Kelvin",new Kelvin());

        mass.put("Kilogram", new Kilogram());
        mass.put("Gram", new Gram());
        mass.put("Ounce", new Ounce());
        mass.put("Pound", new Pound());

        speed.put("Kilometer per hour", new Kmph());
        speed.put("Miles per hour", new Mph());
        speed.put("Meter per second", new Mps());
        speed.put("Foot per secont", new Fps());
        speed.put("Knot", new Knot());

        time.put("Nanosecond",new Nanosecond());
        time.put("Microsecond", new Microsecond());
        time.put("Second", new Second());
        time.put("Minute", new Minute());
        time.put("Hour", new Hour());
        time.put("Day", new Day());
        time.put("Week", new Week());
        time.put("Month", new Month());
        time.put("Year", new Year());





    }

    public static Set getKeySet(String measureType){
        switch (measureType){
            case "Length":
                return lengths.keySet();
            case "Time":
                return time.keySet();
            case "Temperature":
                return temperature.keySet();
            case "Speed":
                return speed.keySet();
            case "Mass":
                return mass.keySet();
            default:
                return null;
        }
    }

    public static double getConversionRate(String measureFrom, String measureTo, String measureType){
        switch (measureType){
            case "Length":
                return lengths.get(measureFrom).getRate(measureTo);
            case "Time":
                return time.get(measureFrom).getRate(measureTo);
            case "Temperature":
                return temperature.get(measureFrom).getRate(measureTo);
            case "Speed":
                return speed.get(measureFrom).getRate(measureTo);
            case "Mass":
                return mass.get(measureFrom).getRate(measureTo);
            default:
                return 0;
        }

    }

    public static double convertToFromFahrenheit(String from,String to,double value){
        if(from.equals("Celsius")){
            return (value * 9/5) + 32;
        } else if(from.equals("Kelvin")){
            return (value - 273.15) * 9/5 + 32;
        } else if(from.equals("Fahrenheit") && to.equals("Kelvin")){
            return (value - 32) * 5/9 + 273.15;
        } else if (from.equals("Fahrenheit") && to.equals("Celsius")){
            return (value - 32) * 5/9;
        }
        return 0;
    }

}
