package dev.ranieri.wrappers;

public class WrapperPlayground {

    public static void main(String[] args) {

        // wrappers are OBJECT Versions of primitives
        int x = 100;
        Integer y = 100;// Wrapper version of int

        // int Integer
        // boolean Boolean
        // char Character
        // short Short
        // long Long
        // float Float
        // double Double
        // byte Byte

        // Wrappers are objects and therefore are stored in HEAP memory
        // Every *object* in Java is stored in the heap
        // primtives can live in STACK memory and this is where your methods execute
        // primitives can be 10x faster to do math with than wrappers


        long start = System.nanoTime();//

        for(int i = 0; i <10_000; i++){
            Integer a = 200;
            Integer b = 200;
            Integer c = a +b;
        }

        long end = System.nanoTime();
        System.out.println("nanoseconds " + (end-start)); // 263,300 nanoseconds for primitivies 1,840,700
        // any values in the HEAP will take time to access

        // autoboxing and unboxing
        // Autoboxing: Java will automatically turn primtives into wrapper
        // Unboxing: Java will turn wrappers into primtives

        Integer n1 = 900;
        Integer n2 = 1800;
        add(n1,n2); // unboxing
        subtract(9,2);// autoboxing
    }

    static int add(int a, int b){
        return a+b;
    }

    static int subtract(Integer a, Integer b){
        return a-b;
    }
}
