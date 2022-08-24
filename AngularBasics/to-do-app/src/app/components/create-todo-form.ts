import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";



@Component({
    template:`

        <h4>Make a ToDo</h4>
        <label for="descInput">Description Input</label>
        <input name="descInput" type="text" [(ngModel)] = "desc"/>
        <button (click)="createTodo()">Create ToDo</button>
    
    `,
    selector:"todo-form"
})
export class TodoFormComponent{

    constructor(private todoService:ToDoService){};

    desc:string = "";


    createTodo(){
        const todo:ToDo = new ToDo(Math.random(),this.desc,false);
        this.todoService.addToDo(todo);
    }


}