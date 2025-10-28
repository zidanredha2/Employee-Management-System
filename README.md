# 🧾 Employee Management System

A full-stack **Spring Boot** project that manages employee data securely using **Spring Security**, **JPA/Hibernate**, and **REST APIs**.
It demonstrates authentication, role-based authorization, and CRUD operations for employees.

---

## 🚀 Features

* 👤 **User Authentication & Authorization** (via Spring Security)
* 🔐 Role-based Access Control (`ADMIN`, `USER`)
* 🧩 CRUD operations for Employee management
* 🗄️ Data persistence using **Spring Data JPA** with **MySQL**
* 🧱 Preloaded sample data using a DataInitializer
* ⚙️ Passwords encrypted using **BCrypt**
* 🧰 RESTful APIs following standard design conventions

---

## 🧠 Tech Stack

| Layer             | Technology      |
| ----------------- | --------------- |
| Backend Framework | Spring Boot 3   |
| Security          | Spring Security |
| ORM               | Hibernate / JPA |
| Database          | MySQL           |
| Build Tool        | Maven           |
| Language          | Java 17+        |

---

## 📁 Project Structure

```
src/
├── main/java/com/example/employee_management_system/
│   ├── Configurations/        # Security configuration (HttpSecurity, PasswordEncoder)
│   ├── Controller/            # REST controllers for Employee and User APIs
│   ├── Models/                # Entity classes (Employee, User)
│   ├── Repositories/          # JPA repositories for database access
│   ├── Service/               # Business logic and UserDetailsService
│   └── DataInitializer.java   # Preloads default users & employees
└── resources/
    ├── application.properties # Database connection config
    └── static/                # (Optional) Static web assets
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/zidanredha2/Employee-Management-System.git
cd Employee-Management-System
```

### 2️⃣ Configure Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Build & Run the Application

```bash
mvn spring-boot:run
```

---

## 🔑 Default Credentials (for testing)

| Role  | Username | Password |
| ----- | -------- | -------- |
| ADMIN | admin    | admin123 |
| USER  | user     | user123  |

*(Passwords are BCrypt-encoded in the database)*

---

## 🧭 API Endpoints

| Method   | Endpoint          | Description        | Access      |
| -------- | ----------------- | ------------------ | ----------- |
| `GET`    | `/employees`      | Get all employees  | ADMIN, USER |
| `GET`    | `/employees/{id}` | Get employee by ID | ADMIN, USER |
| `POST`   | `/employees`      | Add new employee   | ADMIN       |
| `PUT`    | `/employees/{id}` | Update employee    | ADMIN       |
| `DELETE` | `/employees/{id}` | Delete employee    | ADMIN       |

Use **Basic Auth** in Postman with the credentials listed above.

---

## 🧑‍💻 Author

**Redha Zidan**
💼 Aspiring Full Stack Developer
📧 [zidanredha2@gmail.com]
🌐 [https://www.linkedin.com/in/redha-zidan/]

---

## 🏁 License

This project is open-source.
