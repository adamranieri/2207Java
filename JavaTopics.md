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
    - Block Scope: A variable decalred inside a bloack of code (inside of any two curly brases) is only visibvle in that block
        - This include for-loop, if-statements, other-loops, etc
        - Method scope is effectively a specific form of block scope

## Non-access Modifiers
- Methods are **able** to have non-access modifiers, that are not required to. You declare them in the method signature and it comes right after the access modifier. 
    - Static: Static members belong to thge class, as opposed to the object of that class.
        - Static methods can only call other static methods directly
    - Other non-access modifers include final, abstract, syncronized, volatile, and transient
        - Final is self explanitory, it is **"final"** you cant change it
            - Variables are unable to be reassigned
            - Classes cannot be inherited
            - Methods cannot be overridden 
        - Abstract is something we will talk about later when it comes to abstract classes

## Return Types
- Methods have a return type, even if you think they dont
    - Return types define what the method "gives back" when it is called
    - Your general return types are going to be void, primitive values, or objects

## Parameters
- Your methods **can** take parameters, but they dont have to
    - Parameters aer the method's arugments
- Generally your parameters are going to be some tpye of data that your are trying to manipulate or use
    - Parameters are listed inside of the parenthesis after the methods name
    - They can be objects or primitives, or nothing at all I guess, and the method will have access to the names that you give them

## Java Object
- An object is an instance of a class
    - Like building a house based on a blueprint. Class = Blueprint, Object = House
- Objects are created using the class as a bluefrint for the their **initial** state and behaviors

## Constructors
- A constructor is a special type of method that initializes objects
- SPecifically it assigns values to an objects variables
- Every class will have constructor (even if you dont write one)
    - The complier will add a default "no-args" constructor for you even if you dont add one yourself
    - **It should be noted** the moment you provide own constructor, the complier will eliminate the default no-args that it was going to make for you. So you will need to add it manually
- Keyword **Super**
    - Super will call the **parent constructor**
- Keyword **this**
    - **this** will either assign a value , or call another constuctor when used
        - **Constructor chaining** is when you use the **this** keyowrd to call other constructors
- The first line of **ANY** constructor must be a call to etiher "super()" or "this."
    - If you do not have your first line do one of these things, the complier will try to add a call to super for you
        - If the parent class does not have a no-args constructor, your code just come compile :(