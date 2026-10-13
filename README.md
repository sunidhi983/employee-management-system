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
- Postman

API Endpoints

The APIs can be tested using **Postman**.

| HTTP Method | Endpoint              | Description                 |
|-------------|-----------------------|-----------------------------|
| POST        | `/api/employees`      | Add a new employee          |
| GET         | `/api/employees`      | Retrieve all employees      |
| PUT         | `/api/employees/{id}` | Update an existing employee |
| DELETE      | `/api/employees/{id}` | Delete an employee          |

### Testing with Postman

1. Start the Spring Boot application.
2. Open Postman.
3. Select the required HTTP method.
4. Enter the API endpoint, for example, `http://localhost:8080/api/employees`.
5. For POST and PUT requests, select **Body → raw → JSON** and provide the employee data.
6. Click **Send** and check the response.

How to Run

1. Install Java and MySQL.
2. Create a MySQL database named `employee_management`.
3. Configure the database connection in `application.properties`.
4. Run the application from IntelliJ IDEA or using Maven.

The application runs on `http://localhost:8080` by default.

Learning Outcomes
This project demonstrates REST API development, CRUD operations, dependency injection, database integration, input
validation, DTOs, and exception handling.


Screenshots

1. Get All Employees

2. Add Employee

3. Validation Error