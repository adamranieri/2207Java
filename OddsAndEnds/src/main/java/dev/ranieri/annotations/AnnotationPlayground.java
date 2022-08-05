package dev.ranieri.annotations;



public class AnnotationPlayground {


    public static void main(String[] args) {
        // any time you see @ in Java that is an annotation
        // annotations do not inherently do anything to your code. They are a way for other Java code to read Java code
        // annotations are form of meta programming

        Person person = new Person(101,"Adam","Ranieri");
        Person p2 = new Person();
        System.out.println(person);
    }

}
