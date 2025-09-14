Rentora
Spring Boot backend for PG/Flat rental management with user authentication, role-based access, and property CRUD APIs.

📌 Project Overview
Rentora is a Spring Boot backend application for managing PGs and Flats.
It allows users to register, login, and explore properties, while admins can add, update, and manage properties.
The system follows a layered architecture using Entities, DTOs, Repositories, Services, and Controllers.

🚀 Features
User Management

Register and login with role-based access (Admin, Buyer, Seller).
Secure email and password handling.
User profile view and update.
Property Management

Admin can create, update, delete property listings.
Buyers/Sellers can view available properties.
Properties include: name, owner, address, city, rent, description, amenities, images, and booking status (Vacant/Booked).
Role-Based Access

Admin → Full CRUD operations on properties.
Buyer/Seller → View/search properties, manage profile.
DTO Usage

Clean separation between Entity and exposed API response.
Request/Response DTOs for registration, login, update, and property details.
🛠️ Tech Stack
Backend: Java, Spring Boot
Database: MySQL
Build Tool: Maven
Tools: Postman (API testing), Git/GitHub
Architecture: RESTful APIs, Layered (Controller → Service → Repository)
