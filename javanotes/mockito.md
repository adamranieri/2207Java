# Mockito
- Very popular library for perfrormign mocking in tests

## The Problem 
- We have methods we want to test that rely on other methods working correctly
  - Services rely on your DAOS working correctly
  - DAO methods that rely on previous methods
- Tests dependent on other tests in general should be avoided
  - Tests to as atomically as possible verify functionality of a single method

## Mocks and Stubs
- Fake implementations of objects used for testing
  - Mocks and stub tend to be used synonmously
    - Stub is an actual implemenation written by a developer for purposes of testing or development
      - LocalDaos
    - Mocks completey fake objects that only return what they are programmed to do