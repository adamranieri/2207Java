package dev.ranieri.abstractions;

public class Bee extends Animal implements Flyable{

    Bee(int age){
        super(age);
    }

    // MUST be implemented
    @Override
    void eat() {
        System.out.println("Getting some nectar from flowers!");
    }

    @Override
    public void fly() {
        System.out.println("BUZZ BUZZ");
    }
}
