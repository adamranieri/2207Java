# JWT

## The Problem
- Authenticating people on the internet is *hard*
  - Seeing who made the HTTP request is often essential for security
- **Server side Sessions**
  - Object in the backend that would track a user
    - Often paired with a session ID 
  - Works fine for monolithic non-scaling applications
  - As applications undergo horizontal scaling keeping track of user state with an object on the server is not pratical

## The Solution
- We want someway for the client to say who they are
  - we want to be able to believe them
- JWTs are uneditable *facts* sources of truth that you can verify
  - You can give a JWT to a person and they can use it to authenticate themselves

## Encoding vs Encrypting
- Encoding
  - Putting data into another format to make it easier to transport
- Encrypting
  - making the data obfuscated so that it cannot be read unless you have a key to read it

## JWT
- **JSON Web Token**
  - A JSON that serves as an immutable source of truth for you application
- JWT information is not encrypted
  - Do not put anything in a JWT that is sensitive
    - SSIDs
    - passwords
- Do not let JWTs get copied/stolen
  - Anyone who copies your JWT could pretend to be you
- JWTs are typically passed in the header of an HTTP request
  - The controller is responsible for reading this header verifying the JWT and reviewing the claims to see if they have permission