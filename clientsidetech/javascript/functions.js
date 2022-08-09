// JS is a cake-salad of programming paradigms. Supports functional, OOP
// JS is a functional programming first. classes are rarely used in most JS and was not even supported until 2015

function hello(){
    console.log("Hello Everyone");
}

// hello();
// hello();

// function with parameters
function greet(name){
    console.log("Hello " + name);
}

// there is no way to enforce what datatype is passed in
greet("Tim");
greet(90);
greet();// will pass in undefined for name. Not an Error
greet("Tim","Extra", 90);// extra parameters are just ignored. Not an Error

// there is no overloading in JS. making a function with the same name overrwrites the same function
function greet(){
    console.log("New greet")
}// function defintion was hoisted and therefore was used on the previous lines
greet("Tim");