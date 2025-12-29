# Spring Boot Assignment - Controllers & Services

This project demonstrates building simple REST APIs using Spring Boot with controllers, services, and dependency injection

## Setup
1. Clone the repo
2. Open in your IDE and run

## Endpoints

- POST `/departments`
	→ {
		"name": "Finance - Department",
	  "address": "Panadura"
	}
- GET `/departments`
  	→ [
    {
        "id": 1,
        "name": "Finance - Department",
        "address": "Panadura"
    }
]
- GET `/subtract?a=10&b=5` → 5
- GET `/multiply?a=10&b=5` → 50
- GET `/greet?name=John` → "Hello John, welcome!"
- GET `/message` → "ආයුබෝවන්!" (@Primary used)
