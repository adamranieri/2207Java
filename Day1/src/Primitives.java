public class Primitives {

    // Java primitives are one of the few things that ARE NOT objects in Java
    // Primitives are very simple data types

    public static void main(String [] args){

        // 8 primitives
        // all primitives have default values
        // boolean : false
        // everything else: 0

        boolean b = true; // n/a
        byte y = 100; // 1 byte of memory  -128, 127 2^8 bits , whole numbers
        short s = 100; // 2 bytes Whole numbers
        char c = 'k'; // 2 bytes Whole number // chars in Java are just numbers in disguise
        int i = 10000; // 4 bytes whole number -2.1 billion - 2.1 billion
        float f = 90.1f; // 4 bytes decimals
        long l = 900000; // 8 bytes whole numbers
        double d = 100.0; // 8 bytes decimals

        // you can add underscores to make the value more readable
        int population = 7_000_000;

        // anytime a value has a decimal it defaults to a double. Will have to specifically put f for float
        float j = 100.9f;

        // You can always safely store values from one primtive in another *IF* that primtivite is largetr
        long x1 = 10;
        int x2 = 5;
        x2 = (int) x1;// explicit casting forcing one datatype to be treated as another (datatype)
        // explicit casting is usually a symptom of a poorly designed program

        short s1 = 2;
        short s2 = 2;
        int s3 = s1 + s2;// for purposes of arithmetic values smaller than an int turn into an int
        // equality operator in Java == checks to see if two primitives are the same VALUE

        System.out.println(s == d);

    }
}
