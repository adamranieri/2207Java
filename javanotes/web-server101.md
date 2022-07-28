# Web Server 101
- A Web Server is a program that hand respond to HTTP requests

# HTTP
- Hyper Text Transfer Protocol
  - This is how 99% of all infomation on the web is sent on the web
- Request Response based system
  - A Client will send an HTTP request
  - A Server will send back an HTTP Response

## Anatomy of an HTTP Request
- HTTP version
- URL
  - Where to send the request
- Verb
  - The type of HTTP request it is
- Headers
  - Key value pairs that contain meta-information about the request
  - Often used for authentication information
- Body
  - Contains the primary content of the request

## Anatomy HTTP Response
- Status code
  - Ordered by the hundreds
    - 404, 403
- Body
  - Primary content of the response
- Headers
  - Key Value pairs that contain meta-information about the response

### RESTful Web Server
- Is a architecture of a web server that is designed to track a specific resource(s)
- A resource is just a group of objects you are tracking
  - Cars
  - Computers
  - Physicians
- **CRUD** operations for that resource
  - Create
  - Read 
  - Update
  - Delete 

- Examples
  - GET /cars
    - Should return all the cars on your server
  - POST /cars
    - Should add a car to the server
  - PUT /cars/101
    - Should replace that specific car
  - DELETE /cars/203
    - Should delete that specific car

## It is impossible to send back a Java OBJECT from a server

### The Problem with web servers
- Ideally the internet Programming Language agnostistic
  - There are billions of different web servers using tons of different languages
  - And they all want to talk to each other in some standard format
- Every programming language has unique datatypes
  - python int, float
  - Java int, long double
  - C++ have signed and unsigned numbers
- **String**
  - Is the one data type that is near uniformly supported in every programming language
  - Whenever we send or receive information from a web server it will be a string
  - However, we want that string in a SPECIFIC format for ease of use by all types of web servers
- **JavaScript** is the most popular programming language in the world
  - Every single browser runs JS
  - Web Browsers are BY FAR the most popular way to make web requests
- ***JSON***
  - JavaScript Object Notation is a ***STRING FORMAT***
  - Primary format for sending information on the web

### Rules of JSON
- An object is dentoed as curly brackets
- The keys of the object are put in quotes
- String values are put in quotes
- boolean and numeric values are not put in quotes
- NOT SPACE SENSITIVE
```Java
class Person{

  private int ssn;
  private String fname;
  private String lname;
  private boolean isAlive;

  // imagine consructors and getter/setters
}
Person patrick = new Person(123456789,"Patrick", "Orwin", true);
Person tim = new Person(444444444,"Tim", "G", false);

```
- The patrick Java Object **serialized** as a JSON String
```JSON
{
  "ssn":123456789,
  "fname":"Patrick",
  "lname":"Orwin",
  "isAlive": true
}
```
- Tim java object serialized as a JSON string
```JSON
{
  "ssn":444444444,
  "fname":"Tim",
  "lname":"G",
  "isAlive": false
}
```