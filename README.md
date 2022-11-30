# Project web services with Spring Boot e JPA / Hibernate

# About projeto ⁉️ 

https://course-javade.herokuapp.com

This project is part of the course "Java COMPLETO Programação Orientada a Objetos +Projetos", organized by [DevSuperior](https://devsuperior.com "Site da DevSuperior").
The application consists of a web services, more specifically a back-end API of a part of a sales system.


## Domain Model
![domain model](https://user-images.githubusercontent.com/69324694/203998861-f747da4f-fcab-4442-8dcb-e35e75e6ff6f.png)

## Domain Instance
![domain instance](https://user-images.githubusercontent.com/69324694/203998994-efd08a2c-8fe9-48fc-9c38-8d10349d0dc5.png)

## Logical Layers
![image](https://user-images.githubusercontent.com/69324694/204042811-0d92823a-7a61-4951-874f-a597dc3d970b.png)

## Technologies
- Java 11
- Spring Boot 2.7.5
- JPA / Hibernate
- Maven
- H2 Database 
- PostgreSQL
- Postman 

# How it works
## If you are going to download the project
If you don't have PostgreSQL, change in file:application.properties, in the variable spring.profiles.active, change prod to test, then the application will use the H2 Database.

### Endpoints for tests
#### Query (GET)
- Users (http://localhost:8080/users)
- Orders (http://localhost:8080/orders)
- Categories (http://localhost:8080/categories)
- products (http://localhost:8080/products)

#### Update (PUT)
- Users (http://localhost:8080/users/1) put the ID and in the body of the request, put the field and the value you want to change.
![pastman(update)](https://user-images.githubusercontent.com/69324694/204048693-9580fba6-23c4-4bea-950b-f45fda15d505.png)
- Categories (http://localhost:8080/categories/{id})

#### Delete(DELETE)
- http://localhost:8080/users/{id}
- http://localhost:8080/categories/{id}

#### Insert(POST)
- Users (http://localhost:8080/users) In the body of the request, put the field and the value you want to insert.
- Categories (http://localhost:8080/categories)

All tests can be done in Postman


## if it's just testing the application in production
Just change http://localhost:8080 to https://course-javade.herokuapp.com, for the GET methods, example: https://course-javade.herokuapp.com/users

### Author
**Adenilton Morais Arcanjo**

https://www.linkedin.com/in/adeniltonarcanjo/
