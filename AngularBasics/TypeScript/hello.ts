
// you declare a type on a variable by doing :type
let fname: string = "Adam";
let age: number = 19;
fname = "Bill";

// fname = 8; ERROR type mismatch
// Types are inferred if not declared

let lname = "Ranieri";
// lname = 9;// even if the type was not declared TS can determine that lname is a string and there is a type mismatch

function greet(person: string): void{
    console.log(`hello ${person}`)
}

greet("Kim");
greet(fname);

function add(num1: number, num2: number): number{
    return num1 + num2;
}

function squareRoot(num:number): number{

    if(num>0){
        return Math.sqrt(num);
    }else{
        throw new Error("Can't take square of a negative number");
    }

}

const square: number = squareRoot(100);
console.log(square);

