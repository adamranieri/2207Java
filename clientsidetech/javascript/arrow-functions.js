
// Arrow functions are an ES6 syntax for making functions
// 99% of the time arrow functions are just an alternate syntax

function hello(fname){
    console.log("Hello " + fname);
}

const hola = (fname) =>{
    console.log("Hola " + fname);
};

hola("tim")

// if a function has only one input you can omit the parentheses
const bonjour = fname =>{
    console.log("Bonjour " + fname);
}

// if your function body is a single line
// you can omit the curly brackets and the result is automatically returned
const add = (num1,num2) => num1 + num2;

// function add(num1,num2){
//     return num1 + num2;
// }

const isEven = num => num %2 === 0;
// function isEven(num){
//     return num %2===0;
// }
console.log(isEven(99))

const nums = [90,34,-7,-6,100,23]
const positiveNumbers = nums.filter(n => n>0);
console.log(positiveNumbers)