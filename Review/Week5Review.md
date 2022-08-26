# Week 5 Review

## TypeScript
- **Superset** of JS
  - Any valid JS is valid TS
  - TypeScript has features that JS does not have
- ***Typing***
  - Ability to add static typing to our variables
  - Typechecker will ensure that there are no runtime type coercions or unexepected properties when the code execute
- **OOP**
  - interfaces
  - access modifiers
  - Had classes before JS in 2015
- Configurable language
  - **tsconfig.json** the configuration file for any TS in a folder
    - The target JS to **transpile** into
    - Code checking features, like null safety or unreachable code

# Angular
- Frontend Framework for building web sites
- Angular is a **SPA** (single page application)
  - There is only a single *real* page in your application
  - All routing is actually just html/css/js being swapped in and out on the page
- Angular uses TS and TS only


## Angular Architecture
- ***app.module.ts***
  - main registry file your application
  - services, components, pipes must all be added to the app.module.ts to be used in an Angular applicaiton
- ***Components***
  - Main building blocks of an Angular application
  - The visual UI elements that users interact with
    - Template: HTML (visual aspect)
    - styles: CSS for the component
    - selector: tag name in Angular,
    - TS class: the logic for that component
  - Components are reusable
  - Components are self contained
  - Components can be nested
    - one component tag within the template of another component
    - parent-child 
- ***Services***
  - Behind the scenes logic for your application
  - Services are **singletons**
    - Whenever you create a service and register it, Angular creates one instance and only 1 instance
    - This singular instance is shared by every component that uses it
  - Services are added to a component via dependency injection
    - You declare the service in the constructor of a component and angular will inject the instance into the component
  - Common use cases
    - HTTP requests 
      - The logic for making a request typically will be reused in many places in an application
    - utility functions 
    - Sharing data between components
      - Services are singletons so if data in a service is altered by 1 component 
      - All components using that service data would see that reflected
- ***Pipes***
  - Transform an input into an output
  - Typicaly for formatting data before it gets on the screen
    - {{cost | currency}}

## Angular Directives
- A directive is ***custom html***
  - Any time you write something that is not real html you are dealing with a directive
- three types of directives
  - Component
    - custom HTML tags
  - Structural Directives
    - Edit the structure of the DOM
      - *ngFor
      - *ngIf
  - Attribute Directives
    - Custom html attributes
      - [(ngModel)]

## Binding
- Tieing DOM elements and events to values and methods in TS
- Event Binding
- Interpolation
- Two Way binding
- Attribute binding

```html
    <!-- event -->
    <button (click)= "hello()">Click me</button> 

    <!-- interpolation -->
    <h1>{{name}}</h1> 

    <!-- Two Way -->
    <input [(ngModel)] ="lname">

    <!-- Attribute Binding -->
    <img [src] ="url">
    

```

```TypeScript

@Component({
  selector: 'my-component',
  templateUrl: './something.component.html'
})
export class MyComponent implements OnInit {

    constructor() { }
    name: string = "Adam";
    lname:string = "Ranieri";
    url ="./image.jpg"

    hello(){
    }
}

```

## Routing
- app-routing.module.ts
- File that contains all routes for your application
- Router is a router service that allows you to programmtically do routing if required


### HTTP requests and observables
- HTTP client module for making http requests in Angular
- It returns Observables instead of promises by default
- ***Observable***
  - An array that is populated over time
![Observable](https://reactivex.io/assets/operators/legend.png)
- You can process values as they arrive
- HTTP requests we are only expecting a single response
  - We can turn it into a promise for our use


### Docker Review v2
