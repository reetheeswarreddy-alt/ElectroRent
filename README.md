# ElectroRent - Online Electronics Rental Platform

Beginner full-stack Java project for learning HTML, CSS, JavaScript, Spring Boot, REST APIs, JPA and H2.

## Technologies
- HTML5, CSS3, JavaScript
- Java 17
- Spring Boot 3.5.5
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project structure
- `src/main/java/com/electrorent/` - Java backend
- `src/main/resources/static/` - frontend
- `pom.xml` - Maven configuration

## Run
1. Install Java 17+ and Maven.
2. Open a terminal in this project folder.
3. Run: `mvn spring-boot:run`
4. Open: `http://localhost:8080`
5. API: `http://localhost:8080/api/products`
6. H2 console: `http://localhost:8080/h2-console`

H2 JDBC URL: `jdbc:h2:file:./data/electrorent`
Username: `sa`
Password: empty

## GitHub
```bash
git init
git add .
git commit -m "Initial ElectroRent application"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/ElectroRent.git
git push -u origin main
```

## Next upgrades
Login/JWT security, MySQL, admin dashboard, payments, rental orders, email notifications and cloud deployment.
