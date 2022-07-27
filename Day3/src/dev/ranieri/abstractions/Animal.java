package dev.ranieri.abstractions;

// Abstract makes the class UNABLE to be directly created
abstract public class Animal {

    int age;

    Animal(int age){
        this.age = age;
    }

    // IF a class is abstract you can optionally create abstract methods
    // you delay the implemenation to a child class
    abstract void eat();
}
