# Week 6 Review

## Spring
- Lightweight framework for Java 
  - **Framework** 
    - Inversion of Control
      - The application calls your code. NOT vice versa
      - You build a *spring* application. You are conforming your code to fit into the style demanded by the framework
- Hugely Popular
- Spring is Modular by design

## Spring Modules

### Spring Core
- The only mandatory module in a spring applicaiton
  - It is the **Application Context** aka *IoC(Inversion of Control) container*
- **Bean**
  - An object that is managed by Spring and lives in the application context
  - Everything about that bean in controlled by spring
    - Creation
    - Deletion
    - Depedencies
      - Spring has automatic Depedency Injection
    - **Dependency Injection**
      - Process of an injector supplying dependent fields
        - **Setter**
          - The setter methods are used to set the dependencies in a bean
        - **Constructor**
          - The constructor is used to set the dependenices in abean
      - One is not better than the other
      - @Autowired
        - marks a field as dependecny needing an injection from the applicaiton context upon startup
![Spring Bean Lifecycle](https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png)
- Defining/adding Beans to the Application Context
  - Many spring modules will generate beans behind the scenes
    - Spring Data will make Beans that are implemenations of your repo interfaces
  - @Bean
    - This goes on a method that returns an object
    - This is used as a defintion for a bean
  - @Component or a Stereotype of Component
    - Used on a class to define a bean
    - @Controller
      - Bean for handling http requests
    - @Service 
      - Bean for doing business logic
    - @Repository
      - Bean for performing Data operations
    - @Configuration
      - Define multiple beans using @Bean on the method
- Old School Spring used XML for defining Spring Beans
- Bean Scopes
  - **Singleton**
    - One instance only in the applicaiton context
    - Bean is created once when the applicaiton start
    - All component beans are singletons
      - You only need one instance of those classes for your app to work
  - **Prototype**
    - Everytime you get a bean from the application context you get a new one
  - **Request**
    - One bean per http request
  - Portlet
    - 1 bean per portlet

## Spring Web
- Module of spring for handling HTTP requests and responses
  - Spring Web used to be called **Spring MVC**
  - MVC is design philosophy for building applciations
    - **Model**
      - An entity/dto/object with same data
    - **View**
      - HTML template where the object data could get mapped to
    - **Controller**
      - Pair the Model and view together and then sending it back to the client
    - the backend did **SSR** Server Side Rendering and returned HTML instead of a JSON
- More an more JS on the frontend took care of rendering. The backend just sent the information.
  - Rebranded it as Spring Web to make it more generic
![Spring MVC](https://static.javatpoint.com/sppages/images/flow-of-spring-web-mvc.png)
- **Annotations**
  - @Controller
  - @ReponseBody
  - @RestController
    - Convience to avoid putting @ResponseBody on every method
  - @RequestParam
  - @ReqeustBody
  - @PathVariable
    - For query parameters
  - @GetMapping and the other verbs
## Spring Data
- Module for peforming Data layer operations
  - Interacting with a database
- **ORM** Object Relation Mapper
  - Annotate your entity class and Spring Data will map it to a table in your SQL database
  - Spring data will then use the mapping to generate the CRUD functionality for you
- **Hibernate**
  - Spring framework is built on top off an older Java ORM called Hibernate
    - A lot of exceptions say hibernate and it is because Spring is using that code
- Annotations to know
  - @Entity
  - @Table
  - @Column
  - @GeneratedValue
  - @Id
  - @Repsitory
- Steps
    1. add the datasource and driver properties to your application.properties
    2. Annotate your entity class
    3. Create a RepoInterface for that entity
       1. @Repository
    4. Main Applicaiton file has 
       1. @EnityScan
       2. @EnableJpaRepositories
- Custom Queries
  - Abstract methods you write in the interface
  - So long as they conform to the JPA standard
    - Spring Data can read your method names and generate queries
  - @Query
    - Used to write queries directly if needed
  - The vast majority of CRUD operations you need are already supplied by Spring Data

## Spring Actuator
- Module with dev tools for Spring
- Mostly just adds end points with helpful information
  - Typically disabled before you deploy it somewhere

## Spring AOP
- Aspect Oriented Programming
  - Another paradgigm of programming
- **CCC**
  - Cross Cutting concerns
  - features of an application that cannot be addressed by a single layer
    - Security, Logging
- **Aspect**
  - A class that cand execute **Advice** methods throughout an application
  - Advice excutes based on a **pointcut** expression


# Spring Boot NOT A MODULE 
- Spring boot is a very opinioated quickstart version of spring
  - *Convention over Configuration*
- It does a lot of low level configuration for you automatically
  - it sets up an embedded HTTP server for you directly
- **applicaiton.properties**
  - Main configuration file for Spring Boot
    - port
    - datasource
    - actuator enpdpoints