package dev.ranieri.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedList {

    public static void main(String[] args) {

        // ArrayList will store objects in a sequential block of memory
        // LinkedList will store objects throughout memory and reference the other objects via pointing
        // Because they both implement list they can do the same thing. Just differently

        List<Object> objects = new LinkedList();

        long start;
        long end;

        start = System.nanoTime();

        for (int i = 0; i < 100_000; i++){
            //add 100,000 objects to the list at the end
            objects.add(new Object());
        }
        end = System.nanoTime();
        System.out.println("Time to add to end 100,000 times " + ((end-start)/1_000_000_000.0));

        start = System.nanoTime();
        for (int i = 0; i < 100_000; i++){
            //get object in middle 100,000 times
            objects.get(50_000);
        }
        end = System.nanoTime();
        System.out.println("Get object in middle 100,000 times " + ((end-start)/1_000_000_000.0));


        start = System.nanoTime();
        for (int i = 0; i < 100_000; i++){
            //add object to front 100,000
            objects.add(0,new Object());
        }
        end = System.nanoTime();
        System.out.println("Add object to front 100,000 times " + ((end-start)/1_000_000_000.0));

    }
}
