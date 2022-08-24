import { Injectable } from "@angular/core";
import { ToDo } from "../models/todo";


// This is a DEPENDENCY of components that will be injected into their constructor
// by Angular. Dependency Injection
@Injectable() 
export class ToDoService{

    pendingTodos: ToDo[] = [];

    completedTodos: ToDo[] = [];


    addToDo(todo:ToDo):void{
        this.pendingTodos.push(todo);
    }

    markTodoComplete(id: number){
        
        for(let i = 0; i< this.pendingTodos.length; i++){
            if(this.pendingTodos[i].tId === id){
                this.pendingTodos[i].isComplete = true;
                this.completedTodos.push(this.pendingTodos[i]);
                this.pendingTodos.splice(i,1);
            }
        }
    }

}