# Microservices

## The Problem
- Large companies end up with huge software ecosystems
  - Dozens or even hundreds of applications
  - Data saved in different databases
  - Applications that have to communicate with other applications
  - The usage of any one of these applications can vary greatly throughtout the day or throughout the year

## Monolith Applications
- The *entire* web app is a single program
  - This one backend handles everything for an application
  - Your backend for p1 was monolithic
    - A single application held all the code necessary to make your p1
- Pros
  - All the code for an application is in a single place
  - Deployment relatively straightforward
- Cons
  - Monolithic can become monstrous in size as complexity grows
    - They can become difficult to work on
    - 100's to 1000's of files
    - It can be difficult for developers new to the project to pick up on how it works
    - It can be difficult to add new features without fear of breaking something else in the program
  - Monoliths cannot scales services individually
    - which can be very inefficent
  - Monolith failures mean the whole application is unusable

## Microservice Applications
- Individual Services are made their own standalone application
- pros
  - Each service can scale indiviudally
  - The codebase for a micro service can be much smaller and easier for new developers on the project to work on
  - Each microservice can be in a different programming language
    - Any lanugage can handle HTTP requests
- cons
  - Microservices are more difficult to set up
    - Lot more moving pieces
  - Latency can become an issue
    - A lot more HTTP traffice
    - Especially when one microservice tries to communicate to another microservice

### How Microservices Communicate
- Send HTTP requests directly to the micro-service
  - Relatively fast
  - Straight Forward
  - cons
    - Need to know the URL of the service
      - **Discovery Problem**
        - Boatloads of software designed to handle this
          - Eureka
          - Zuul
          - Zookeeper
          - consul
          - Spring Cloud
    - Latency can be an issue
- Messaging Queues
  - **Prodcuer** Applications send messages to a **Queue**
  - Queue
    - a container of messages stored in order of recieving them
    - Messages are processed in the order recieved
  - **Consumer** Application read messages from a queue
  - Pros
    - Dirt cheap
      - million+ transactions before a single dollar
    - Scale really well
      - Can handle sudden spikes in messages recieved
      - No messgaes are lost from a queue
  - Cons
    - Asynchronous
      - When you send a message you get no response
    - Messages might take a while to process
      - Can be on the order of minutes for a message to even get to a queue
      - If the consumers are overworked messages are not process for hours or even days


