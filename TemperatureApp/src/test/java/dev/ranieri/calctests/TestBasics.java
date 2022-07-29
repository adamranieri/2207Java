package dev.ranieri.calctests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// golden rule of tests. So long as an exception is NOT thrown. The test passess
public class TestBasics {

    @Test
    void test1(){

    }

    @Test
    void test2(){
        throw new RuntimeException("fsefewff");
    }

    @Test
    void test3(){
        Assertions.assertEquals(10,9);// Throw an error if not equals
    }

}
