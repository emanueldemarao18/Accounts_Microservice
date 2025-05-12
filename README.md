# Accounts Microservice

![Java](https://img.shields.io/badge/Java-14%20%2F%2017-blue?style=flat&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?style=flat&logo=springboot)
![License](https://img.shields.io/github/license/emanueldemarao18/Accounts_Microservice)

## 📌 Overview

This project is a microservice for managing account-related operations, built with Java and Spring Boot.  
It provides functionality to create, read, update, and delete accounts (CRUD), and is intended to be used within a microservices architecture.

## 🚀 Technologies Used

- Java 14 (Amazon Corretto) or Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- H2 Database (for testing)  
- JUnit 5  
- Maven

## 🧩 Features

- Full CRUD for accounts  
- Input data validation  
- Global exception handling  
- Automatic API documentation with Swagger  
- Unit and integration tests

## ⚙️ How to Run

### Prerequisites

- Java 14 (Amazon Corretto) **or** Java 17  
- Maven 3.8 or higher

### Steps

```bash
# Clone the repository
git clone https://github.com/emanueldemarao18/Accounts_Microservice.git

# Navigate into the project directory
cd Accounts_Microservice

# Build and run the application
mvn spring-boot:run
