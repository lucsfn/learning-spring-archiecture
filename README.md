# Spring Architecture Study Project

Simple Spring Boot project built while learning architecture concepts and common Spring features.

## What this project covers

- REST APIs with Spring Web MVC
- Dependency Injection and bean configuration
- Qualifiers and custom annotations for selecting implementations
- Layered structure (controller, service, repository)
- JPA entity mapping with Spring Data JPA
- Basic business validation and error handling
- H2 in-memory database for local development

## Main modules

- **ToDo module**
  - Create, update, and get todos
  - Validation to avoid duplicated descriptions
  - Simulated mail sender on status updates

- **Car manufacturer module**
  - Endpoint to start a car
  - Engine selection using custom qualifier annotations (`@Turbo`, etc.)
  - Bean definitions centralized in configuration class

## Tech stack

- Java 21
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven

## Run locally

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Application starts on:

`http://localhost:8080`

## API endpoints

### ToDos

- `POST /todos`
- `PUT /todos/{id}`
- `GET /todos/{id}`

### Cars

- `POST /cars`

## Testing requests

Postman collections are available in `src/main/resources`:

- `ToDos.postman_collection.json`
- `Manufacturer.postman_collection.json`

Import them into Postman to quickly test the endpoints.
