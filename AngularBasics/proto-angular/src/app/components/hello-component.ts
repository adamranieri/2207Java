import { Component } from "@angular/core";


@Component({
    template:`
        <h1>Welcome to my Angular web app </h1> 
        <p>It is an awesome web app <sub>created by {{author}} </sub> </p>

        <button (click)="hello($event)">Hello</button>
        
        `, //  HTML
    selector:"hello" // name of custom html tag
})
export class HelloComponent{

    author:string = "Adam Ranieri"; // {{}} is interpolation

    hello(event:MouseEvent){
        // console.log(event); you can get the event if needed
        // 95% of the time if you are getting the event you are not doing it the Angular way
        alert("Hello")
    }
}