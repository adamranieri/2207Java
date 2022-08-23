import { Component } from "@angular/core";


@Component({
    template:`
        <h4>Hello what is your name</h4>
        <input type="text" placeholder="billy" [(ngModel)] ="name">
        <button (click)="greet()">Greet</button>
        <p>Welcome {{name}}</p>
        `,
    selector:"greeter"
})
export class GreeterComponent{

    name:string = "";

    greet(){
        alert(`Hello ${this.name}`);
    }

}