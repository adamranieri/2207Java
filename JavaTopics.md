## Java Classes
- The best way I can think to describe one is as template or a blueprint for an object
- You declare your classes with access modifiers which control the visbility the class
    - Eg. **Public** class Launcher
    - There can be one public class per file. The anme of the public class **MUST** match the file name
- Classes contain variables (fields) and behaviors (methods)
    - Fields are variables that store information about the class
    - Methods are blockis of code that represent some action that our class can take
        - In other languages, they may be refered to as functions
- Think of the field like the attriubtues of a class and the methods as its behaviors
- The fields and methods of our class are also known the members
- Best practice for your classes is to use upper-case CamelCase
    - Eg. ThisIsMyClass
- A class can extend another class with the "extends" keyword


## Java Methods
- Define the behaviors of a class/object
    - This what our class/object can do
- Methods can be thought of as blocks of code that can be claled (used) multiple times (repeatable block of cose)
- You often use Methods to manipulate data in some way or do something
- Methods (and fields) are conventionalled named using lower-case camelCase
    - Eg. thisIsMyMethod();
- Anatomy of a method
    - [Access modifer] [Non-access modifer (optional)] [Return Type] [Name] (parameters) {}

## Access Modifers
- Methods are declared with **access modifer**. This access modifer determines the availability/visibility of the method to the outside classes
    - public: The method is accessible to any other class in your project
    - private: **ONLY** accessible/visible to the class itself
        - we most comomon use this modifer for encapsulation
    - protected: The method is accessiblie to anything within the same package **PLUS** any subclasses that inherit the class
    - default: The method is only accessible to anything within the same package

## Variable Scope
- The variable scope defines where a variable can be access from in the code
- There are 4 scopes in Java:
    - Class (Static) Scope: Static variables must be declared inside a Class. These static variables are accessible to all objects of that class
        - A change in the value of a class scoped variable is reflected in **ALL** other objects of that class
        - Class variables can only be accessed from static.
    - Instance (Object) Scope: The variable is non-static and is accessible anywhere within the object
        - Generally these are called field variables
        - A change in the value of a non-static variable will **ONLY** be reflected in that specific object
    - Method Scope: Variables declared in a method can **ONLY** be acccessed in that method. 
        - This also includes the variables that are used are the parameters (arugments) given to the method
    - Block Scope: 
