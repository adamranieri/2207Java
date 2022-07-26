# OOP in Java 

## Class
- Class is a **blueprint/template** for an object
- **Namespace** for functions and variables
  - Feeds into the scalability of the language

## Object
- Object is an instance of a class
- An object is a data structure
  - It owns some variables
    - These are the **fields** of an object
  - It has it own functions that interact with those fields
    - These are the **methods** of an object
- Method vs Function
  - A method is a type of function
  - A method is a function attached to an object

## Access Modifiers vs Scopes
- Scopes (Where a variable lives)
  - Class/static 
    - Variable is attached to the class
  - Instance/object
    - Variable is attached to an object
  - Method
    - Variable is available entirely within the method
  - Local
    - Variable is avaialbe in {} within a method
- You *could* write a whole program with 0 access modifiers

- Access Modifiers are like an *EXTRA layer* on top of scopes
  - LIMIT which classes can access a varialble
  - **Access Modifiers** can ONLY apply to static and instance variables
  - Access Modifiers are almost like firewalls restricting who can get to that variable

# Pillars of OOP
- APIE
- **Abstraction**
  - GOAL: Ability to hide implemnation
  -  abstract classes and interfaces
  -  Even things like using methods is a form of abstraction
- **Polymorphism**
  - GOAL: Ability to treat/label the same object differently
    - Reusability and modular programming
  - Labelling one object as nother
  - **Static Polymorphism**
    - Overloading
  - **Dynamic Polymorphism**
    - Overriding
- **Inheritance**
  - GOAL: DRY code
    - Don't Repeat Yourself
  - extends keyord to derive code from another class
  - Overriding to modify derived code
- **Encapsulation**
  - GOAL: Prevent data and methods from being misuesed elsewhere in the code
  -  Access Modifiers