// arrays are great for callbacks

let names = ["Adam", "Bob", "Christine"];

function introduce(name){
    console.log("Hello " + name);
}

for(let n of names){
    introduce(n);
}
// or
names.forEach(introduce);

let tempsFarenheit = [212,455,90,0];

// a function used for a map should take in 1 value and return a value
function farnheitToCelcius(temp){
    return (temp-32)*5/9;
}

let tempsCelcius = tempsFarenheit.map(farnheitToCelcius); // map will take in an element and return a new value
console.log(tempsCelcius);

//a function used for a filter should take in one value and return true or false
function isPositive(num){
    return num >= 0;
}

let positiveCelcius = tempsCelcius.filter(isPositive);
console.log(positiveCelcius);
