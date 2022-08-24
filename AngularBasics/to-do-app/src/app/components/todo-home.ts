import { Component } from "@angular/core";



// Parent child relationship 
// Todo Home is the parent of about
@Component({
    template:`
        <h2>Awesome todo App</h2>
        <about author="Kurt"></about> 
        <todo-form></todo-form>
        <pending-list></pending-list>
        <completed-todo-list></completed-todo-list>
    `,
    selector:"todo-home"
})
export class TodoHomeComponent{


}