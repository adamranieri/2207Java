public class Welcome {
    // Every Java file MUST have a public class named the same as the file

    // Every Java program executes starting from the main
    public static void main(String[] args) {

        // zero ambiguity class is serving as a namespace
        English.hello();
        Spanish.hello();
        System.out.println(English.greeting);
        English.greeting = "New version";
        System.out.println(English.greeting);

        // Java has a lot of utility classes which are classes that are namespaces for a bunch of static functions
        Math.random();

    }

}

// The static method or variable belongs to the CLASS. not an instance of that class
// static DOES NOT mean that variable cannot change.
// static refers the memory address of the variable. It always has the same memory address.
// And there is only ever one copy of it in the whole program
class English{
    static String greeting = "From my English class";

    static void hello(){
        System.out.println("Hello" + greeting);
    }

}

class Spanish{

    static void hello(){
        System.out.println("Hola");
    }
}
