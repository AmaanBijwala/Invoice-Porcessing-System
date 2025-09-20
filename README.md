Invoice-Processing-System


Invoice-Processing-System is a simple full-stack application built with:
Frontend: React
Backend: Java Spring Boot

The project provides a basic workflow for managing invoices.

🚀 Features
Add a new invoice from the UI.
All invoices appear in a Pending state by default.
Approve or Reject invoices directly from the UI.
Backend exposes REST APIs for CRUD operations.
Status updates (Pending → Approved/Rejected) are handled through the backend.

🛠️ Tech Stack

Backend:
Spring Boot,Java,JPA / Hibernate,MySQL 

Frontend:
React

▶️ Running the Project
Backend
Clone the repository.
Navigate to the backend folder.
Configure database in application.properties.
Run:
mvn spring-boot:run
Server runs at http://localhost:8080

Frontend
Located in frontend/ (React). Run using:
npm install
npm start
Frontend runs at http://localhost:3000
