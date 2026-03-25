# Student Management System – Spring Boot REST API

A RESTful backend application built using Spring Boot, Spring Data JPA, and MySQL to manage student records.
This project demonstrates real-world backend development practices including layered architecture, validation, and exception handling.


---

## 🚀 Features

- RESTful API design using Spring Boot
- Full CRUD operations (Create, Read, Update, Delete)
- MySQL database integration
- ORM using Spring Data JPA & Hibernate
- Layered architecture (Controller → Service → Repository)
- Global Exception Handling
- Input Validation using annotations
- Proper HTTP responses using ResponseEntity

---

## 🛠 Tech Stack

* **Language**: Java
* **Framework**: Spring Boot
* **ORM**: Hibernate / Spring Data JPA
* **Database**: MySQL
* **API Testing**: Postman
* **Build Tool**: Maven
* **IDE**: IntelliJ IDEA
*  **Version Control**: Git & GitHub



---

## 📂Project Structure

studentapi
│
├── controller        # REST Controllers
├── service           # Business Logic
├── repository        # Database Access
├── entity            # JPA Entities
├── exception         # Custom Exceptions & Handlers
└── StudentApiApplication.java


---

## ⚙️ Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db

spring.datasource.username=root

spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true


---

## 📌 API Endpoints

➕ Create Student

**POST** /students

Request Body:

{
"name": "Arun",
"email": "arun@gmail.com",
"course": "MCA",
"marks": 90
}


---

### 📄 Get All Students

**GET** /students


---

### 🔍 Get Student by ID

**GET** /students/{id}


---

### ✏️ Update Student

**PUT** /students/{id}


---

### ❌ Delete Student

**DELETE** /students/{id}


---

## ⚠️ Validation Example

Invalid Input:

{
"name": "",
"email": "wrong",
"course": "",
"marks": 150
}

Response:

{
"name": "Name is required",
"email": "Invalid email",
"course": "Course is required",
"marks": "must be less than or equal to 100"
}


---

## ▶️ How to Run

1. Clone the repository


2. Open in IntelliJ IDEA


3. Configure MySQL database


4. Run StudentApiApplication.java


5. Test APIs using Postman




---

## 🎯 Learning Outcomes

* Built REST APIs using Spring Boot
* Implemented layered architecture
* Replaced JDBC with JPA ORM
* Handled exceptions globally
* Applied input validation
* Designed production-ready backend

---

## 🔮 Future Improvements

* Add authentication (JWT)
* Add pagination & search
* Build frontend (React/Angular)
* Deploy on cloud (AWS/Render)

---

## 👨‍💻 Author

Arun Rangad

---

## ⭐ If you like this project

Give it a star on GitHub ⭐