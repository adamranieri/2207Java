package dev.ranieri.abstractions;

public class Bird  extends  Animal implements Flyable{

    Bird(int age){
        super(age);
    }

    @Override
    void eat(){
        System.out.println("Uses beak to get a worm");
    }

    void squawk(){
        System.out.println("SQUAWK");
    }

    @Override
    public void fly() {
        System.out.println("FLAP FLAP");
    }
}
