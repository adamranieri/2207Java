# TypeScript

## The Problem
- Front Ends for modern web applications are very complicated
  - JS was designed to be flexible and web pages were envisioned to be much simpler
- JS lacks a lot of features that prevent it from scaling well in large applications
  - Dynamically typed means that it is difficult to know what data type your variables are
  - Type Coercion everywhere means you often get results you are not expecting
  - Tendency to fail without throwing an error or telling you what is wrong

## Solution (TypeScript)
- Write in a language that has features you want that can then be ***transpiled*** in JS
  - Kotlin
  - CoffeScript
  - Flow 
  - ***TypeScript***

## TypeScript Features
- Robust ***Type System***
  - variables will have types
  - return types
  - etc....
- OOP
  - classes
  - interfaces
  - access modifiers
- Transpile TS into any version of JS
  - great if you have legacy browsers
  - You can write an app in the latest and greatest syntax and libraries 
- Configureable programing language
  - You can opt into different features of the language 
  - ***tsconfig.json***
    - A file that will contain compilation options for .ts files in this folder