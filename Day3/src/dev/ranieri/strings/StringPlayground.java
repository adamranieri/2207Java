package dev.ranieri.strings;

public class StringPlayground {

    public static void main(String[] args) {
        // Strings are the data type for an array of characters
        // Strings are one of the very few objects that you do not NEED a new keyword to create

        String fname = "Adam";
        String lname = "Ranieri";
        String clone = "Adam";
        String lnameClone = new String("Ranieri");

        char [] name = {'A','d','a','m'};
        // == between objects compares memory address
        // Strings with the same value WILL be optimized to be same object in memory
        System.out.println(lname == lnameClone);// false
        System.out.println(lname.equals(lnameClone));// true

        // String are IMMUTABLE Objects
        String newString = fname.toUpperCase(); // generates a new string in memory with ADAM
        System.out.println(newString);

        StringBuilder fname2 = new StringBuilder("Adam"); // mutable version of string "Adam"
        fname2.reverse();
        System.out.println(fname2); // "madA"

        // String manipulation is way faster using string builder

        long start;
        long end;

        start = System.nanoTime();
        String a = "";
        for(int i =0; i< 1000; i++){
            a = a + "b";
        }
        end = System.nanoTime();
        System.out.println("Append b 1000 times " + (end-start)/1_000_000_000.0);

        start = System.nanoTime();
        StringBuilder a2 = new StringBuilder("");
        for(int i =0; i< 1000; i++){
           a2.append("b");
        }
        end = System.nanoTime();
        System.out.println("Append b 1000 times " + (end-start)/1_000_000_000.0);



    }
}
