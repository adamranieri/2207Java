// JS has incredibly aggressive type coercion
// JS will compare apples to oranges even if they are both bananas

console.log(8 =="8");// true JS will coerce the string 8 into a number and then compare them
console.log( 0 == "0");// true
console.log(0 == "");// true
console.log(0 == false);// true
console.log("false" == false);// false
console.log(null == false);// false
console.log(null == null); //true
let result = 100/"random string"; // not an error. JS performs the operation the result is not a number
console.log(result);// NaN
console.log(typeof 'Adam');// string
console.log(typeof result);// NaN is actually of type Number

console.log(result == false);// false
console.log(result == result);// false NaN always returns false in a comparison
// Truthy and Falsy values
// all values in JS are truthy (they will be converted into the boolean true)
// EXCEPT for the 6 falsy values

// they all imply nothingness
Boolean(0);
Boolean("");
Boolean(false);
Boolean(null);
Boolean(undefined);
Boolean(NaN);

// === strict equality (almost always use strict equality)
// compares both the data type and value
console.log(2 == "2");//true
console.log(2 === "2");// false
