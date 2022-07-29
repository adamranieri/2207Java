package dev.ranieri.calculators;

import java.util.Map;

// we need to write a temperature for some scientists
// K, C, F
public interface TempConvertor {

    double celciusToFarenheit(double celcius);
    double celciusToKelvin(double celcius);

    double convertTemp(String source, double temp, String target); // could be refactored as enums

    Map<String,Double> getAllConversions(String source, double temp);

}
