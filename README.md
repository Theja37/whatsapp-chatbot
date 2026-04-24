# WhatsApp Chatbot Backend Simulation

A simple WhatsApp chatbot backend built with Java and Spring Boot.

## Features
- REST API endpoint `/webhook` to receive POST requests
- Accepts JSON input simulating WhatsApp messages
- Predefined replies:
  - Hi → Hello
  - Bye → Goodbye
- Logs all incoming messages

## Tech Stack
- Java 17
- Spring Boot 3.5
- Maven

## How to Run
```bash
mvn spring-boot:run
```

## Test the API
Send a POST request to `http://localhost:8080/webhook`
```json
{
  "message": "Hi"
}
```

## Response
```json
{
  "reply": "Hello"
}
```
