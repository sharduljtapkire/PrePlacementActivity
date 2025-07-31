# Spring Boot Learning Projects

This repository contains multiple Spring Boot applications demonstrating various concepts from basic REST controllers to advanced MongoDB integration with proper error handling and response entities.

## 📋 Table of Contents

- [Projects Overview](#projects-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Details](#project-details)
- [API Endpoints](#api-endpoints)
- [Running the Applications](#running-the-applications)

## 🚀 Projects Overview

### 1. **Dependency Injection Demo**
- **Package**: `com.marvellous.Dependency`
- **Purpose**: Demonstrates Spring's dependency injection using field injection
- **Components**: Laptop, Harddisk, RAM classes

### 2. **Simple REST API**
- **Package**: `com.marvellousinfosystems.First`
- **Purpose**: Basic REST controller implementation
- **Functionality**: Simple laptop details endpoint

### 3. **Demo Application**
- **Package**: `com.marvellous.Ganesh`
- **Purpose**: Simple greeting application
- **Functionality**: Returns a greeting message

### 4. **Batch Management System (Main Project)**
- **Package**: `com.marvellous.MarvellousPortal`
- **Purpose**: Complete CRUD application for managing batch entries
- **Evolution**: Progresses from in-memory storage to MongoDB integration
- **Features**: 
  - Full CRUD operations
  - MongoDB integration
  - Proper error handling
  - ResponseEntity implementation
  - Lombok integration

## 🛠 Technologies Used

- **Spring Boot** 2.x/3.x
- **Spring Web** - REST API development
- **Spring Data MongoDB** - Database operations
- **MongoDB** - NoSQL database
- **Lombok** - Reducing boilerplate code
- **Maven** - Dependency management
- **Java** 8+

## 🏁 Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6+
- MongoDB (for MarvellousPortal application)
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/spring-boot-learning-projects.git
cd spring-boot-learning-projects
```

2. Install dependencies:
```bash
mvn clean install
```

3. Configure MongoDB connection in `application.properties`:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/marvellous_portal
```

## 📁 Project Details

### Batch Management System Architecture

```
MarvellousPortal/
├── Entity/
│   └── BatchEntry.java          # MongoDB Document model
├── Repository/
│   └── BatchEntryRepository.java # Data access layer
├── Service/
│   └── BatchEntryService.java   # Business logic layer
├── Controller/
│   ├── BatchEntryController.java # REST endpoints
│   └── HealthCheck.java         # Health check endpoint
└── MarvellousPortalApplication.java # Main application class
```

### Key Features Evolution

#### Version 1: In-Memory Storage
- HashMap-based storage
- Basic CRUD operations
- Simple return types

#### Version 2: MongoDB Integration
- MongoDB document storage
- ObjectId usage
- Optional handling

#### Version 3: Enhanced Error Handling
- ResponseEntity implementation
- Proper HTTP status codes
- Exception handling

#### Version 4: Code Optimization
- Lombok integration
- Reduced boilerplate code
- Cleaner entity classes

## 🔗 API Endpoints

### Batch Management System

| Method | Endpoint | Description | Response |
|--------|----------|-------------|----------|
| GET | `/batches` | Get all batch entries | List of BatchEntry |
| POST | `/batches` | Create new batch entry | Created BatchEntry |
| GET | `/batches/id/{id}` | Get batch by ID | BatchEntry or 404 |
| PUT | `/batches/id/{id}` | Update batch by ID | Updated BatchEntry |
| DELETE | `/batches/id/{id}` | Delete batch by ID | 204 No Content |
| GET | `/HealthCheck` | Application health status | "Everything is OK" |

### Sample Request/Response

#### Create Batch Entry
```json
POST /batches
Content-Type: application/json

{
    "name": "PPA",
    "fees": 25000
}
```

#### Response
```json
HTTP/1.1 201 Created
Content-Type: application/json

{
    "id": "60f7b3b3b3b3b3b3b3b3b3b3",
    "name": "PPA",
    "fees": 25000
}
```

### Other Applications

#### Dependency Demo
- GET `/Laptop` - Returns laptop configuration with injected components

#### Simple REST API
- GET `/LaptopDetails` - Returns laptop details

#### Demo Application
- GET `/PPA` - Returns greeting message

## 🏃‍♂️ Running the Applications

### 1. Dependency Injection Demo
```bash
cd dependency-demo
mvn spring-boot:run
```
Access: `http://localhost:8080/Laptop`

### 2. Simple REST API
```bash
cd first-application
mvn spring-boot:run
```
Access: `http://localhost:8080/LaptopDetails`

### 3. Demo Application
```bash
cd ganesh-demo
mvn spring-boot:run
```
Access: `http://localhost:8080/PPA`

### 4. Batch Management System
```bash
cd marvellous-portal
mvn spring-boot:run
```
Access: `http://localhost:8080/batches`

## 📊 Database Schema

### BatchEntry Collection (MongoDB)

```json
{
    "_id": ObjectId,
    "name": String,
    "fees": Number
}
```

## 🧪 Testing

You can test the APIs using:

### cURL Examples
```bash
# Get all batches
curl -X GET http://localhost:8080/batches

# Create new batch
curl -X POST http://localhost:8080/batches \
  -H "Content-Type: application/json" \
  -d '{"name":"Java","fees":30000}'

# Get batch by ID
curl -X GET http://localhost:8080/batches/id/60f7b3b3b3b3b3b3b3b3b3b3

# Update batch
curl -X PUT http://localhost:8080/batches/id/60f7b3b3b3b3b3b3b3b3b3b3 \
  -H "Content-Type: application/json" \
  -d '{"name":"Advanced Java","fees":35000}'

# Delete batch
curl -X DELETE http://localhost:8080/batches/id/60f7b3b3b3b3b3b3b3b3b3b3
```

### Postman Collection
Import the provided Postman collection for comprehensive API testing.

## 🔧 Configuration

### Application Properties
```properties
# Server Configuration
server.port=8080

# MongoDB Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/marvellous_portal
spring.data.mongodb.database=marvellous_portal

# Logging
logging.level.com.marvellous=DEBUG
```

## 📈 Future Enhancements

- [ ] Add input validation
- [ ] Implement pagination for GET all endpoint
- [ ] Add authentication and authorization
- [ ] Implement caching
- [ ] Add comprehensive unit tests
- [ ] API documentation with Swagger/OpenAPI
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

## 👨‍💻 Author

**Shardu Tapkire**

## 🙏 Acknowledgments

- Spring Boot Documentation
- MongoDB Documentation
- Java Community
- Stack Overflow Community

---

⭐ **If you found this project helpful, please give it a star!** ⭐