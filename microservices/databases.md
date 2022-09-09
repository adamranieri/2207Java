# Database
- Any program that can physically persist information
  - Turn off the power the data is still there
- **SQL** is the king

### NoSQL
- Any type of database that **IS NOT SQL**
- There is no standard NoSQL database
  - MongoDB
  - CockroachDB
  - CosmosDB Azure's NoSQL database
  - Redis
  - Fauna

### MongoDB
- The most popular NoSQL database
- There are no tables like SQL
- **Cluster**
  - The actual servers/infrastructure
- **Databases**
  - Logical serperation of data (namespaces)
    - Just like how postgres has multiple dbs on the same server
- **Collections**
  - a group of documents
  - Like a table expecpt tere is no schema
- **Documents**
  - individual records
  - Stored JSONs
    - Every document has an auto genrated _id field
- The schemaless nature of documents means there are no constraints or rules on the data being stored
  - There is no structure within documents you must adhere to
- NoSQL databases often encourage nested data
  - Having arrays within your document
- Documents being very malleable can be a good thing or a bad thing
- pros
  - rapid prototyping it can be very helpful
  - Nice synnergy with Agile where software is expected to be changed as necessary
- cons
  - You might expect properites that do not exist
  - Not all documents have the same data


### Mongo Atlas
- A cloud service by MongoDB
- You can pick what major provider you want their services to run on
  - This does not make a difference to us

