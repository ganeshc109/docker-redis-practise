# A-config-repo

This repository serves as the **Spring Cloud Config Server Git-backed configuration source**.

## 🛠 Purpose

Stores externalized configuration files (YAML format) for microservices in the system.

## 🗂 Structure

- `A-user-service.yml`: Configuration file for the **A-user-service** microservice.

## ⚙️ Example Configuration (inside this repo)

```yaml
spring:
  application:
    name: A-user-service
  datasource:
    url: jdbc:mysql://mysql:3306/userdb
    username: root
    password: root
  jpa:
    hibernate:
      ddl-auto: create
