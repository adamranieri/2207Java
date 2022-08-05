package dev.ranieri.interfaceadvanced;

public interface Greetable {

    // when you implment this interface if you do not override you get the default implementation
    default void greet(String name){
        System.out.println("Hello " + name);
    };


}
