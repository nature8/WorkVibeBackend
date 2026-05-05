# WorkVibeBackend
# Job Portal Application

## Overview

This project is a full-stack Job Portal Application that allows users to view job listings and apply for available positions. The application is built using a simple and clean architecture without implementing authentication or security features.

It is designed for learning and demonstration purposes, focusing on core backend and frontend integration.

---

## Features

### User Features

* View all available job listings
* Search jobs by title, location, and required technologies
* Filter jobs based on experience and location
* Apply for jobs

### Backend Features

* RESTful APIs for job management
* Create, update, delete, and fetch job records
* Search and filter functionality using query methods

---

## Technology Stack

### Frontend

* HTML
* CSS
* JavaScript

### Backend

* Spring Boot
* Spring Data JPA (Hibernate)

### Database

* PostgreSQL

---

## Project Structure

```
Job-Portal/
│
├── backend/
│   └── src/main/java/com/
│       ├── controller/
│       ├── model/
│       └── repository/
│
├── backend/src/main/resources/
│   ├── application.properties
│   ├── schema.sql
│
└── README.md
```

---

## Database Schema

The database structure is defined in the `schema.sql` file located in:

```
src/main/resources/schema.sql
```

### Jobs Table

| Column Name        | Type      | Description           |
| ------------------ | --------- | --------------------- |
| id                 | BIGSERIAL | Primary key           |
| title              | VARCHAR   | Job title             |
| languages          | VARCHAR   | Required technologies |
| requirements       | TEXT      | Job requirements      |
| experience         | VARCHAR   | Required experience   |
| location           | VARCHAR   | Job location          |
| last_date_to_apply | VARCHAR   | Application deadline  |

---

## Setup Instructions

### Prerequisites

* Java (JDK 17 or above)
* Maven
* PostgreSQL

---

### Database Setup

1. Create a PostgreSQL database:

```
CREATE DATABASE JobDB;
```

2. Optionally run the `schema.sql` file manually in PostgreSQL.

---

### Backend Setup

1. Navigate to the backend directory
2. Configure database properties in `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/job_portal
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa
```

3. Run the application:

```
mvn spring-boot:run
```

---

### Frontend Setup

1. Navigate to the frontend directory
2. Open `index.html` in a browser or use a local server

---

## API Endpoints

| Method | Endpoint                      | Description               |
| ------ | ----------------------------- | ------------------------- |
| GET    | /jobs                         | Get all jobs              |
| GET    | /jobs/{id}                    | Get job by ID             |
| POST   | /jobs                         | Create new job            |
| PUT    | /jobs/{id}                    | Update job                |
| DELETE | /jobs/{id}                    | Delete job                |
| GET    | /jobs/location/{location}     | Filter jobs by location   |
| GET    | /jobs/language/{language}     | Filter jobs by language   |
| GET    | /jobs/experience/{experience} | Filter jobs by experience |
| GET    | /jobs/search/{keyword}        | Search jobs by title      |


---

## Future Improvements

* Add user authentication and authorization
* Implement job application tracking
* Add pagination and sorting
* Improve UI/UX
* Add validation and error handling
* Introduce service layer for better architecture

---

## License

This project is intended for educational purposes.
