// JS has 3 scopes
// scopes are determined by the keyword used when creating a variable, let, const, var or nothing
// nothing global
// var function scoped (kinda deprecated)
// let, const block scope

function a(){
    x = 100;// if you do not put let,const or var in front of a variable it becomes global and used anywhere in the application
    // you almost never want to make global variables
    console.log(x);//100
}
a();
console.log(x);// 100

function b(){
    let y = 1000; // block scoped variable. cannot leave the curly brackets it was declared in
    y = 600;// let variables can be reassigned
    console.log(y);
}
b();
//console.log(y)// not defined is an actual error. occurs when a variable doesn't even exist

function c(){
    const z = 5000;
    z = 90; // error assignment to a constant variable
    console.log(z);
}
//c();

// var you should never use
// hoisting bizzared behavior in JS where variable declarations but not the values are pulled to the top of a function
// functions in JS execute in 2 parts. 1st part JS will allocate memory for variable declared in the function. 2nd part will actually execute the code
function d(){
    console.log(j); // undefined
    var j = 200; 
}
d()