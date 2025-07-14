# Copilot Instructions

<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->

## Project Overview
This is a Spring Boot project using:
- Java 17
- Maven for dependency management
- Spring Boot 3.2.0
- Spring Web for REST APIs
- Spring Data JPA for database operations
- H2 in-memory database for development

## Code Style Guidelines
- Use standard Java naming conventions
- Follow Spring Boot best practices
- Use dependency injection with @Autowired
- Create proper REST endpoints with appropriate HTTP methods
- Include proper error handling and validation
- Write clean, readable code with meaningful variable names

## Project Structure
- `com.example.demo.controller` - REST controllers
- `com.example.demo.service` - Business logic services
- `com.example.demo.repository` - Data access layer
- `com.example.demo.model` - Entity classes
- `src/main/resources` - Configuration files and static resources

## Development Notes
- The H2 console is available at http://localhost:8080/h2-console
- API endpoints are prefixed with `/api/`
- Default server port is 8080
- Sample data is loaded from data.sql on startup
