# TicketHub

TicketHub is a RESTful event ticketing platform built with Spring Boot. The application allows event organizers to create and manage events while providing customers with the ability to browse, search, and book tickets for various events.

## Overview

This is a backend application that provides APIs for managing events, venues, and user authentication. The platform supports multiple event categories including music, sports, theater, comedy, and festivals. Users can register accounts, browse published events, and administrators can create and manage events and venues.

## Technology Stack

- Java 21
- Spring Boot 3.2.1
- Spring Security with JWT authentication
- Spring Data JPA
- PostgreSQL database
- Flyway for database migrations
- Maven for dependency management
- Lombok for reducing boilerplate code

## Features

### User Management

- User registration and authentication
- JWT-based security
- Role-based access control (USER, ADMIN)

### Event Management

- Create, update, and delete events (admin only)
- List all published events with pagination
- View event details
- Event categories: Music, Sports, Theater, Comedy, Festival
- Event statuses: Draft, Published, Cancelled

### Venue Management

- Create and manage venues (admin only)
- View venue details
- Associate events with venues

## Project Structure

```
src/main/java/com/tickethub/
├── config/          # Security and JWT configuration
├── controller/      # REST API endpoints
├── dto/            # Data transfer objects
├── entity/         # JPA entities
├── enums/          # Enumeration types
├── exception/      # Custom exception handlers
├── mapper/         # Entity to DTO mappers
├── repository/     # Data access layer
└── services/       # Business logic layer
```

## Getting Started

### Prerequisites

- Java 21
- Maven 3.6+
- PostgreSQL database

### Setup

1. Clone the repository

```bash
git clone https://github.com/demilade111/tickethub.git
cd tickethub
```

2. Configure database connection in `application.properties`

3. Run database migrations (handled automatically by Flyway)

4. Build the project

```bash
./mvnw clean install
```

5. Run the application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Authentication

- POST `/api/auth/register` - Register a new user
- POST `/api/auth/login` - Login and receive JWT token

### Events

- GET `/api/events` - Get all published events (paginated)
- GET `/api/events/{id}` - Get event details by ID

### Admin Endpoints

- Admin endpoints for event and venue management require ADMIN role and JWT authentication

## Database

The application uses PostgreSQL with Flyway migrations. Database schema is automatically created and managed through migration scripts located in `src/main/resources/db/migration/`.

## Security

The application uses Spring Security with JWT tokens for authentication. Protected endpoints require a valid JWT token in the Authorization header.


