// JS used to be a marxist joke utopia no classes
// JS did have objects via object literals
// objects are just key value pairs 

let adam = { fname:"Adam", lname:"Ranieri", age:19, isTrainer: true};

// objects are always mutable
adam.age = 20;// change a value at any time
adam.mi = "C";// add new properties whenever

let adamJSON = JSON.stringify(adam);
console.log(adamJSON);
let patJSON = '{"fname":"Patrick", "lname":"Star"}';
let patObj = JSON.parse(patJSON);

// objects can have functions attached to them. in that case it is a method and uses the this keyword if warranted

let bill = {
    fname: "Bill",
    sayHello: function(){
        console.log("My name is " + this.fname);
    }
}
bill.sayHello();

let billJSON = JSON.stringify(bill);
console.log(billJSON); // functions are excluded from JSONs. JSONs are the primary format for data and supposed language agnostic

// dot notation for accessing properites
adam.fname// "Adam"

// bracket notation is also supported
adam["fname"]// "Adam"