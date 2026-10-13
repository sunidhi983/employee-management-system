Employee Management System

A RESTful web application built using Java, Spring Boot, Spring Data JPA, and MySQL to manage employee records.

Features

- Add a new employee
- View all employees
- Update employee details
- Delete an employee
- Validate employee input
- Handle API exceptions
- Use DTOs for employee responses

Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Postma


API Endpoints

 Method        Endpoint               Description 
 POST       `/api/employees`        Add an employee 
 GET        `/api/employees`        Get all employees 
 PUT        `/api/employees/{id}`   Update an employee 
 DELETE     `/api/employees/{id}`   Delete an employee 



How to Run

1. Install Java and MySQL.
2. Create a MySQL database named `employee_management`.
3. Configure the database connection in `application.properties`.
4. Run the application from IntelliJ IDEA or using Maven.

The application runs on `http://localhost:8080` by default.



Learning Outcomes
This project demonstrates REST API development, CRUD operations, dependency injection, database integration, input validation, DTOs, and exception handling.