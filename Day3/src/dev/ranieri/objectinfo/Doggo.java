package dev.ranieri.objectinfo;

import java.util.Objects;

public class Doggo {

    String owner;
    String name;
    int age;

    @Override
    public String toString() {
        return "Doggo{" +
                "owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doggo doggo = (Doggo) o;
        return age == doggo.age && Objects.equals(owner, doggo.owner) && Objects.equals(name, doggo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, name, age);
    }
}
