package dev.ranieri.objectinfo;

public class ObjectPlayground {

    public static void main(String[] args) {

        // the Object class is the grandfather class of EVERYTHING in Java. Everything is of type object
        Object object = new Object();// there is not much purpose to directly making objects
        // Methods on the object class you should know
        // toString()
        // equals()
        // hashCode
        Point p1 = new Point(10,6);
        Point p2 = new Point(10,5);
        System.out.println(p1.equals(p2));// true
        System.out.println(p1 == p2);

        System.out.println(p1.hashCode());

    }

}
