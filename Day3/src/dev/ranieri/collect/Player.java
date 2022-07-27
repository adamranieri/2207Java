package dev.ranieri.collect;

public class Player {

    String name;
    int age;
    int height;

    public Player(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override // inherited method from the object class
    public String toString(){
        return "name: " + this.name +
                " age " + this.age +
                " height: " + this.height;
    }
}
