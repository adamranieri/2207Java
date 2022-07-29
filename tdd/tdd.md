# TDD
## Test Driven Development
A software paradigm where we write tests first then implementation. Writing tests gives you insight into how your code will work and what edge cases or quirks you should account for.
1. Create an interface for the code you are about to write
2. Design your tests
3. You might end up redesigning your interface to make the methods easier to use
4. Implement your tests
5. Implement that interface

## Avoid writing void methods if you can
- It is very difficult to test code that does not return anything
  - You could always ignore the return if you do not need it
  - Better to have and not need. Then need and not have