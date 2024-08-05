# Order Service Microservice

[![Build Status](https://img.shields.io/travis/ruchirm702/Order_Service.svg)](https://travis-ci.com/ruchirm702/Order_Service)
[![Coverage Status](https://img.shields.io/codecov/c/github/ruchirm702/Order_Service.svg)](https://codecov.io/gh/ruchirm702/Order_Service)
[![License](https://img.shields.io/github/license/ruchirm702/Order_Service.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/java-11-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![Spring Boot](https://img.shields.io/badge/spring--boot-2.7.5-brightgreen.svg)](https://spring.io/projects/spring-boot)

## Project Overview
The Order Service microservice handles CRUD operations for managing orders.

## Technologies Used
- Java
- Spring Boot
- Maven
- JPA (Hibernate)
- MySQL
- Lombok

## Prerequisites
- Java JDK 11 or higher
- Maven
- MySQL 8.0+

## Setup Instructions
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/order_service.git
    cd order_service
    ```

2. Configure the MySQL database in `src/main/resources/application.properties`.

3. Build and run the project:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## API Endpoints
- GET /orders/{id}: Fetch an order by ID.
- GET /orders: Fetch all orders with pagination and sorting.
- POST /orders: Create a new order.
- PUT /orders/{id}: Update an existing order.
- DELETE /orders/{id}: Delete an order by ID.



