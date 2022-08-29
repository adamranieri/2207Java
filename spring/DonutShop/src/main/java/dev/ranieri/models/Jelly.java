package dev.ranieri.models;

// A Java Bean is a class that has private fields, public getters and setters, and a no args constructor
// A Java bean IS NOT a Spring Bean automatically
public class Jelly {

    private String flavor;

    public Jelly() {
    }

    public Jelly(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jelly{" +
                "flavor='" + flavor + '\'' +
                '}';
    }
}
