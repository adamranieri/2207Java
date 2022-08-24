import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";


@Component({
    template:`

        <h4>Completed Tasks</h4>
        
        <ul>
            <li *ngFor="let t of todos">{{t.desc}}</li>
        </ul>
    
    `,
    selector:"completed-todo-list"
})
export class CompletedTaskListComponent{

    constructor(private toDoService:ToDoService){};

    todos: ToDo[] = this.toDoService.completedTodos;

}