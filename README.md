# GitHub CLI Tool

A Java-based command-line application that interacts with the GitHub API to fetch and display user information and repository data.

This project demonstrates core Java concepts including object-oriented programming, API integration, JSON parsing, input validation, and CLI design.

---

##  Features
- Search GitHub users by username  
- View user profile summary (repos, followers, following)  
- View top repositories sorted by stars  
- Displays repository details including language and URL  
- Input validation for usernames and menu options  
- Handles invalid users and API errors gracefully  
- Interactive CLI menu system  

---

## Tech Stack
- Java  
- GitHub REST API  
- JSON parsing (org.json)  

---

## How to Run

### Prerequisites
- Java 21 or higher
- Maven installed

### 1. Build
```bash
mvn package
```

### 2. Run
```bash
java -jar target/github-cli-1.0-SNAPSHOT.jar 
```

---

## What I Learned
- Working with REST APIs in Java
- Parsing JSON responses into structured objects
- Designing modular, maintainable code
- Handling invalid input and API failures
- Building interactive CLI applications

---

## Future Improvements
- Display commit history for repositories
- Add GUI version using Swing or JavaFX

---

## Author
Built by OMA as part of a personal learning and portfolio development journey.

