# Technical Task

The following API is my submission for the technical task assigned to me.

Pre-requisites:
* Java 21 or higher installed in system
* Postman installed in system for API testing

Test Methods:
* Open project within an IDE or clone from github.
* run command ./gradlew bootRun
* Use postman to submit any of the endpoints shown in the Endpoints section of this document.

# API Documentation

Overview:

API allows user to save employee data into an H2 database, and view stored data by calling a corresponding end-point.

## Endpoints
| Operation | URI | DESCRIPTION |
|-----------|---------------- |-------------|
| POST      |/api/v1/employee| Saves employee data indicated in the request body.
| GET       |/api/v1/employees| Retrieves all employee data stored within the H2 database.



## Save Employee Data
Operation: POST

URI: /api/v1/employee

Accepts: JSON string

Request Body Details:
| Key Name | Data Type | Notes |
|----------|-----------|-------|
| firstName |String| |
| lastName |String| |
| title |String| |
| dateOfBirth |LocalDate| format (yyyy-mm-dd) |
| gender |String| |
| email |String|Database constraint: must be unique |
| address |String| |


Request Body Sample:
```
{
  "firstName" : "Peter",
  "lastName" : "Piper",
  "title" : "Pepper Picker",
  "dateOfBirth" : "1989-05-10",
  "gender" : "MALE",
  "email" : "peter.piper@pepperhouse.com",
  "address" : "Wherever peppers grow"
}
```

Sample Response:
```
CODE: 200 OK

{
    "employeeNumber": 1,
    "firstName": "Peter",
    "lastName": "Piper",
    "email": "peter.piper@pepperhouse.com"
}
```

## Get Employee Data

Operation: GET

URI: /api/v1/employees

Sample Response:
```
CODE: 200 OK

[
    {
        "employeeId": 1,
        "firstName": "Pedro",
        "lastName": "Penduko",
        "title": "Monster Hunter",
        "dateOfBirth": "1990-02-03",
        "gender": "MALE",
        "email": "pedro.penduko@schoolofthewof.com",
        "address": "the dark woods"
    },
    {
        "employeeId": 2,
        "firstName": "William",
        "lastName": "Wallace",
        "title": "Accountant",
        "dateOfBirth": "1987-01-10",
        "gender": "MALE",
        "email": "pedro.penduko@schoolofthewof.com",
        "address": "the dark woods"
    },
    {
        "firstName" : "Mary",
        "lastName" : "Sue",
        "title" : "Head Chef",
        "dateOfBirth" : "1995-09-15",
        "gender" : "FEMALE",
        "email" : "mary.sue@mail.com",
        "address" : "flower hill cebu"
    }
]
```