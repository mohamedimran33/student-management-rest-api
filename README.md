# Student Management REST API

A RESTful API built using Java and Spring Boot to manage student records. This project demonstrates CRUD (Create, Read, Update, Delete) operations using a layered architecture.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- Postman

## Features

- Create a new student record
- Retrieve all student records
- Retrieve a student by ID
- Update existing student details
- Delete a student record
- Custom exception handling
- Global exception handling using `@RestControllerAdvice`
- HTTP response handling using `ResponseEntity`

## Project Structure

The application follows a layered architecture:

- **Model:** Represents student data.
- **Controller:** Handles incoming HTTP requests.
- **Service:** Contains the business logic.
- **Exception:** Handles custom application exceptions.

## API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Create a student |
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| PUT | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete a student |

## Data Storage

Currently, student records are stored in an in-memory `ArrayList`. The data is not permanently stored and will be lost when the application restarts.

## Future Improvements

- Integrate MySQL database
- Implement Spring Data JPA
- Add request validation
- Write unit and integration tests

## Author

**Mohamed Imran M**

[GitHub](https://github.com/mohamedimran33) · [LinkedIn](https://linkedin.com/in/mohamed-imran-ai)