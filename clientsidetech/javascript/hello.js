// unlike java there is no main method
// code executes top to bottom
// there is no compiling process. JS is interpreted. 

console.log("Hello");
console.log("World");

// JS is a loosely and dynamically typed language
let fname = "Adam";// no need to declare the variable type (DYNAMIC Typing)
let age = 19; 
age = "Ranieri";// totally fine
// variables are typically declared using the let or const keywords

let b1 = true; 
let b2 = true;
let result = b1 + b2 + false;
console.log(result);// 2 JS is loosely typed, JS will IMPLICITLY coerce datatypes into other dataypes
// this behavior LEADS to a A LOT OF BUGS 
