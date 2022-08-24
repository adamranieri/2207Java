import { Component, Input } from "@angular/core";


@Component({
    template:`
        <p>The to do app is a simple applicaiton for tracking tasks 
            <sub>Created by {{author}}</sub></p>
        <h5>Features include</h5>
        <ul>
            <li>Making todos</li>
            <li>Marking todos complete</li>
        </ul>
    `,
    selector:"about"
})
export class AboutComponent{

    //Will allow you to specify the value of this field
    //when creating the component as a child in another component
    @Input() author:string = "Adam Ranieri";

}