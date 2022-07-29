package dev.ranieri.calctests;

import dev.ranieri.calculators.AbsoluteZeroException;
import dev.ranieri.calculators.TempCalculatorImpl;
import dev.ranieri.calculators.TempConvertor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TempConvertorTests {

    TempConvertor tempConvertor = new TempCalculatorImpl();

    @Test
    void celcius_to_farenheit(){
        double result = tempConvertor.celciusToFarenheit(100);
        Assertions.assertEquals(212,result);
    }

    @Test
    void celcius_below_absolute_zero(){
        // test to see if something DOES throw an excpetion
        Assertions.assertThrows(AbsoluteZeroException.class, ()->{
            double result = tempConvertor.celciusToFarenheit(-1000);
        });

    }

    @Test
    void celcius_to_kelvin(){
        double result = tempConvertor.celciusToKelvin(0);
        Assertions.assertEquals(273.15, result);
    }

    @Test
    void convert_temp_farenheit_celcius(){
        double result = tempConvertor.convertTemp("Farenheit", 212, "Celcius");
        Assertions.assertEquals(100, result);
    }

    @Test
    void convert_temp_farenheit_celcius_letter(){
        double result = tempConvertor.convertTemp("F", 212, "C");
        Assertions.assertEquals(100, result);
    }

    @Test
    void convert_temp_farenheit_celcius_capitalization(){
        double result = tempConvertor.convertTemp("FarenHEIT", 212, "CelcIUS");
        Assertions.assertEquals(100, result);
    }




    // we could throw an error if mispelled
    // we should support F and C
    // we should support crazy capitalization
    // different langauges
    // maybe special characters


}
