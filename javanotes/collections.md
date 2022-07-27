# Collections
- Collections Framework is a network of classes and interfaces that are objects designed to hold other objects.

![Collections Framework](https://facingissuesonitcom.files.wordpress.com/2019/07/java-collection-framework-hierarchy.jpg)

## Interfaces to know
- Collection
  - Root Interface for *most* collections
  - All collections dynamically resize
  - Contains methods like
    - size()
    - add()
- List
  - Allows duplicates
  - Maintains order of insertion
    - Implementations
      - ArrayList
      - LinkedList
- Set
  - No Duplicates
  - Does not maintain order of insertion
    - Implementations
      - HashSet
      - TreeSet
- Queue
  - FIFO
    - LinkedList
- Deque ( newer version of stack)
  - Supports LIFO and FIFO
  - Implemenations 
    - ArrayDeque
- Map
  - Key Value pairs
  - Uniterable (Does not have an iterable interface)
  - **Technially** not a Collection because it does NOT implement the Collection interface
  - Map is a collection in the semantic term of an object designed to hold other objects

