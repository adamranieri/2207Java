package dev.ranieri.calculators;

import java.util.Map;

public class TempCalculatorImpl implements  TempConvertor{

    @Override
    public double celciusToFarenheit(double celcius) {
        return (celcius*9/5)+32;
    }

    @Override
    public double celciusToKelvin(double celcius) {
        return 0;
    }

    @Override
    public double convertTemp(String source, double temp, String target) {
        return 0;
    }

    @Override
    public Map<String, Double> getAllConversions(String source, double temp) {
        return null;
    }
}
