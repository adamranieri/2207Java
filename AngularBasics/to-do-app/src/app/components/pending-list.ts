import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";


@Component({
    template:`
        <h4>Pending ToDos</h4>
        <ul>
            <li *ngFor="let t of todos">{{t.desc}} 
                <button (click)="complete(t.tId)">Mark Complete</button>
            </li>
        </ul>
    `,
    selector:"pending-list"
})
export class PendingTodoListComponent{

    // Angular behind the scenes will inject the instance of the ToDo Service into this
    // component
    constructor(private todoService:ToDoService){};

    todos: ToDo[] = this.todoService.pendingTodos;

    complete(id: number){
        this.todoService.markTodoComplete(id);
    }

}