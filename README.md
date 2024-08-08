# Order Service Microservice

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)

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



