# Angular

## The Problem
- Modern front ends are very large and complicated
- JS and popular JS libraries jQuery could not scale to the level needed for the largest applications
- Vanilla JS can be really tedious and difficult to write
  - manually adding event listeners
  - DOM manipulation is a chore
    - Creating elements
    - Attaching children
- Data management is tricky
  - Getting values in JS into the web page and vice versa

## The Solution
- bajillion different JS frameworks emerged
  - So much that it is a meme
- Three frameworks
  - Angular
    - Google
  - React 
    - Facebook
  - Vue
    - One dude, Evan You who wrote it for fun

## Angular
- AngularJS is the original Angular
  - Deprecated and not supported by Google
- Angluar 2.0 which is just called Angular 
  - Big restructure of the framework
  - made TS mandatory
  - addressed problems with AngularJS
- Angular framework
  - You write code in a format so that it fits into the Angular framework and how Angular does web pages
  - Angular is very oppionated. You do it the Angular way, or it will not work at all.


## Angular Architecture
- ***Components***
  - Resusable Custom chunks of HTML/CSS/TS
  - Visual aspect of any Angular application
    - Template
      - HTML
    - Selector
      - Custom HTML Tag
    - TS Class
      - logic and variables for that component
- ***app.module.ts***
  - Heart of an Angular Application
    - You will register components you create here
    - You will register services you create here
    - label the bootstrap component
      - The intial component that is loaded into the index.html
      - app-root is the default and we do not need to change that

## Binding
- We can tie values in TS to the HTML template
- We can listen to events from the DOM/HTML and process them in the TS
- Interpolation
  - A value in the TS is put into the html
- Event Binding
  - An event is processed by a method in TS
- Two-Way
  - Binds the value in an input field to a variable in TS in real-time and synchrounously updates