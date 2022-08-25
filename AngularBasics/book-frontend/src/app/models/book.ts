export interface Book{
    id: number
    title: string 
    author: string
    returnDate: number
}

// interfaces vs classes in TS
// interface unlike Java can have fields not just abstract methods
// interfaces define the properties that should be on an object. You still have to create the object
// const frankenstein:Book = {id:101, title:'Frankenstein', author:"Mary Shelley", returnDate:0};