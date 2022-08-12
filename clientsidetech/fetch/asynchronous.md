# Asynchronous Programming in JS

## The Problem
- JS is a single threaded language
  - It can only process one thing at a time
  - Java could have multiple threads executing multpile method in parallel
- Some things that JS has to do can take a while to get a response
  - IO Input Output operations 
  - HTTP Requests
  - The process of making an HTTP request and getting a response could be very slow
    - NOTHING you could do to speed that up
- It would be an awful user experience if JS stopped working while waiting for a response

## Asynchronous programming
- The ability to delay execution of code until a certain condition is met
- The **fetch API** is an inbuilt library in all modern browsers for making HTTP requests
- fetch API is built on top of another older library called **AJAX**
  - Asynchronous JavaScript and XML
    - Phenomenally poorly named because nobody uses it to request XML 
    - Was named and created before JSON existed
- 

## Real World Example
- Setting up for a party
1. Clean the living room
2. put on the Gator Game
3. Order a pizza for delivery
   1. There is nothing you could do to speed up the process of the pizza being delivered
4. put some drinks out on the table
5. Open some chips and put them into a bowl
- Eventually the pizza will arrive and you can handle it when it you recieve
  - Waiting for the pizza does not interfere with your ability to do any other tasks
