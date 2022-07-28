package dev.ranieri.abstractions;

public class AbstractionPlayground {

    public static void main(String[] args) {

        // Animal a1 = new Animal(10);// is it ever possible to have something that is JUST an animal
        Lion l1 = new Lion(7);
        Bird bird1 = new Bird(4);
        Bee bee1 = new Bee(1);
        Flyable eagle = new Bird(19);

        bird1.fly();
        bee1.fly();
        eagle.fly();// the label/reference determines HOW you interact with the object



    }
}
