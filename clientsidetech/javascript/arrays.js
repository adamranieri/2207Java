// JS Arrays automatically resize, and can store ANY data type
// arrays are typically made using the array literal syntax
// arrays are more like Java lists. 
let nums = [10,20,30,40,50];

// for(let i = 0; i < nums.length; i++){
//     console.log(nums[i])
// }

// enhanced for loop
for(let num of nums){
    console.log(num);
}

let ray = [null, 9, "Hello", {fname:`Adam`, lname:'Raneri'}, 20];// can put anything you want in an array
console.log(ray);

// add to end of array
ray.push("Hola");
console.log(ray);

// remove from end of array
ray.pop()
console.log(ray);

// insert at index
ray.splice(1,0,"Inserted")
console.log(ray)

// assign a new value
ray[4] = "New value";
console.log(ray)

ray[20] = "Hello";
console.log(ray)

// JS lacks any sort of encapsulation
let names = ["Adam", "Tim"];
names.length = 90;// totally okay
console.log(names);