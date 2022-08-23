// TS has a lot of support for OOP features

// TS only has 3 access modifiers public(same as nothing), private(class only), protected(inherited classes)
class Person{

    public fname: string; // public or no access modifier is the same
    public lname: string;
    private age: number;

    constructor(fname:string, lname: string, age: number){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    
    public sayHello(){
        console.log(`hello my name is ${this.fname} ${this.lname} and I am ${this.age} years old`);
    }
}

const adam:Person = new Person("Adam","Ranieri",19);

// TS has an shortened syntax for constructors in classes
class Dog{
    constructor(public owner:string, public name:string){}
}

const rover:Dog = new Dog("Billy", "Rover");
console.log(rover);