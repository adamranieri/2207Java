# DevOps
![DevOps](https://devopedia.org/images/article/54/7602.1513404277.png)
- Newer term  that is a portmanteau of **Dev**elopment **Op**erations
- All software goes therough development and operation
  - Development 
    - Process of creating and testing the software
  - Operations
    - Process deploying your software and monitoring it

- Development Tools
  - IDEs
  - GitHub
    - GitHub Actions (automatically test our code when put in the repo)
  - Git
  - Gradle
  - SonarCloud
- Operation Tools
  - Azure
    - static web site hosting
    - create databases
    - deploy backend web servers on VM
  - Gradle
    - Can be used to create Jar files
- **Development and Operations** meld into each other
  - Traditionally Development and Operation were different teams
  - Today there is an expectation that everyone can do a bit of both

- **Continuous Integration**
  - CI
  - Getting your code **IN** to a repo
    - Automated tests are usually run when code is put in the repo
  - As developers work on a project they centralize all their code into a shared repo other developers could use.
  - Code used to be a lot harder to maintain because you did not have centralized repos


## Steps to Build and run a Jar
1. add custom task to our build.gradle file
```groovy
task customFatJar(type: Jar) {
    manifest {
        attributes 'Main-Class': 'dev.ranieri.app.App'
    }
    baseName = 'Hello-App'
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from { configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) } }
    with jar
}
```
2. call this task using gradle
   1. Will generate a .jar file in the build/libs folder
   2. **jar** = Java Archive
```bash
gradlew task customFatJar
```
3. run the jar file
```bash
    java -jar app.jar
```
## GitHub Actions
- CI tool for building and testing code when put in a repo
1. go to your repo and press actions
2. Select Java With Gradle
3. edit the permission of the gradlew so that the gradlew so it is executable
```bash
    git update-index --chmod=+x gradlew
```
4. You will want the gradlew and gradlewrapper jar in your repo

## Sonar Cloud
- CI tool for checking code quality
- **Static Code Analysis**
  - Reviews the code without running it
- It will look for bad coding practices **Code Smells**
  - Not bugs but things to improve
    - bad security
    - poor naming conventions
    - complex looking code
      - Cyclomatic Complexity
    - redundancy
    - commented out code
