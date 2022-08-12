// ES6 added classes to JS
// They are not very popular
// there are no access modifiers
// you can only have a single construtor, no overloading for JS in general
class Person{

    fname;
    lname;
    age;

    constructor(fname,lname,age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    sayHello(){
        console.log("My name is " + this.fname);
    }
}

const adam = new Person("Adam","Ranieri", 19);
adam.sayHello()