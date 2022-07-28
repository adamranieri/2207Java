package dev.ranieri.abstractions;

public class Lion extends Animal {

    Lion(int age){
        super(age); // first thing a child
    }

    @Override
    void eat(){
        System.out.println("Hunts down a gazelle and devours it");
    }

    void roar(){
        System.out.println("ROAAAR");
    }
}
