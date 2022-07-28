# Gradle
- Build automation and dependency managagement tool
- Realistically almost any application we write requires Java libraries and code written by someone else
  - Trying to manually incorporate these external libraries in your project is very tedious
- Gradle is written in a programming language called Groovy
  - It is not a popular programming language
  - But it does have some really cool syntax
S
- The main file for any gradle project is ***build.gradle***
  - It is in here we will include any dependencies and instructions on how to build the project
- src
  - Main
    - Java
      - put our Java application code
    - Resources
      - put any files that your program needs that is *not* Java
  - Test
    - Java
      - put our Java testing code
    - Put any files that your test code needs that is *not* Java

