# Spring Boot Assignment - Controllers & Services

This project demonstrates building simple REST APIs using Spring Boot with controllers, services, and dependency injection

## Setup
1. Clone the repo
2. Open in your IDE and run

## Endpoints

### Department Endpoints

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
- PUT `/departments/1`
  	→ {
		"name": "Finance - Department",
	  	"address": "Kalutara"
	}
- DELETE `/departments/1` → "Delete Successfully"

### User Endpoints
  
- POST `/users`
	→ {
	    "first_name": "Thilini",
	    "last_name": "Perera",
	    "email": "thili@abc.com",
	    "phone_number": "0767585568",
	    "dob": "1997-01-06"
	}
- GET `/users`
  	→ [
    {
        "id": 1,
        "first_name": "Thilini",
        "last_name": "Perera",
        "email": "thili@abc.com",
        "phone_number": "0767585568",
        "dob": "1997-01-06"
    }
]
- GET `/users/1`
	→ {
	    "id": 1,
	    "first_name": "Thilini",
	    "last_name": "Perera",
	    "email": "thili@abc.com",
	    "phone_number": "0767585568",
	    "dob": "1997-01-06"
	}
- PUT `/users/1`
  	→ {
	    "first_name": "Thilini",
	    "last_name": "Fernando",
	    "email": "thili@abc.com",
	    "phone_number": "0767585568",
	    "dob": "1997-01-06"
	}
- DELETE `/users/1` → true

