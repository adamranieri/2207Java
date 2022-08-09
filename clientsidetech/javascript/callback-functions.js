// JS is a functional programming language
// functions ARE objects
// functiona are first class citizens

function hello(){
    console.log("hello");
}

hello.fname = "Adam";// we can attached a new property to a function because it is an object

// functions can be stored in variables
let hola = function(){
    console.log("hola");
};

hola(); 
let hola2 = hola;
hola2(); // both variables call the same function

// callback functions. functions passed as a parameter to another function

function doTwice(func){
    func();
    func();
}

let gutentag = function(){
    console.log("Gutentag")
}

doTwice(gutentag);// gutentag is the callback
doTwice(hola);// 

doTwice(function(){
    console.log("Bonjour!!")
});
