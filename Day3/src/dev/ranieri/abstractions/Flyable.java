package dev.ranieri.abstractions;

// interfaces have only abstract methods
// A class can IMPLEMENT as many interfaces as you want
// 1. any variables in an interface are public static final
// 2. all methods are public and abstract
// 3. most interfaces end in 'able' they usually grant the ability to do something
// comparable, iterable, serializable
public interface Flyable {

    void fly();
}
