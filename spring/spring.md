# Spring 
- Java Framework for making web applications
- Immensely popular
  - EJB Entity Java Beans used to be a propiertary Java Framework for Oracle
  - Spring was free and better

## IoC Container and Beans
- Inversion of Control Container
  - **Application Context**
    - A registry of beans
    - It will control these beans
      - How they are created 
      - How they are used
- **Beans**
  - Any object that is controlled by the Application Context
  
## The Problem
- large applications have A LOT of components and moving parts
  - Classes and objects that rely on other objects
  - Lots of configuration details that are updated and changed
- Most developers in large applications will not know how most of the code works
  - Very rare for a single developer to write an entire backend for an application

## The Solution via Spring
- Spring will promote a level of abstraction with beans that will make writing individual pieces of functionality easier
  - *Loose Coupling*
    - Architecture where classes are not hardcoded to each other
- Beans can be 100% managed by the IoC and is a one stop shop for configuration

## Spring Boot
- ***Spring Boot is NOT Spring***
- Spring Boot is a VERY OPIONATED version of spring
  - It will handle a lot of low level configuration and boilerplate for you automatically
- Spring boot IS NOT a module
- **application.properties**
  - the main file for configuration of your Spring Boot App
    - database connection options
    - logging options
    - debug cofiguration
    - port to run on
  
## Modules of Spring
- Spring is expandable and customizable by design
- There are ton of modules that provide specific functionalities
- **Spring Data**
  - For the data layer of an application
  - Allows you to easiliy map Entities to tables
  - create DAOS(Spring data calls them repositories) that interact with those tables
- **Spring Web**
  - For the API layer of an application
  - Handle HTTP requests and make HTTP responses
  - JSON serialization, exception handling, and error codes
- **Spring Acutuator**
  - Adds a lot of dev-friendly routes to your application
  - See configuration info while your app is running
  - Monitor important metrics
    - RAM usage