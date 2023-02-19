## Ecommerce Project
### Requirments
* IntelliJIDEA
* Serverport: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
* Dependencies needed Spring Boot DevTools,Lombok,Spring Web,H2 Database,Spring Data JPA 

### Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience

### Lombok 
* Java annotation library which helps to reduce boilerplate code

### Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container

### H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application

### Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate


## Models
* User Model
* Address Model
* Product Model
* Order Model

## Services 
* User service
* Address Service
* Product Service
* Order Service

## DAO
* User Dao
* Address Dao
* Product Dao
* Order Dao
## Controller
* User Controller
* Address Controller
* Product Controller
* Order Controller

### Working
* In this project we are creating above models accordingly as mentioned in the question and joined the tables of the above models using Join annotation where it has Many to many join,One to one join,Many to one and One to many 
* I have run the code on the h2 console and given the inputs through postman