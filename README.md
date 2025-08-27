# FinalMainProject

A modular, scalable automation testing framework built with Java, Selenium WebDriver, TestNG, and Cucumber—designed for robust CI/CD integration and maintainable test architecture.
## Overview

This framework is designed to simplify and scale automation testing using Java, Selenium WebDriver, TestNG, and Cucumber. It follows Object-Oriented Programming principles and integrates key design patterns like Page Object Model, Singleton, Factory, and Template Method to ensure modularity, reusability, and maintainability.

Key features include:
- Centralized configuration management
- Browser abstraction for cross-browser support
- Thread-safe parallel execution
- Integrated reporting and logging
- CI/CD-ready with Jenkins and GitHub integration

Ideal for teams seeking a robust, extensible solution for UI automation with clean architecture and seamless pipeline integration.

## Folder Structure
FinalMainProject/ 
├── src/ 
│ ├── main/ 
│ │ ├── java/ 
│ │ │ ├── config/ # Centralized configuration files 
│ │ │ ├── drivers/ # Browser abstraction and driver management 
│ │ │ ├── pages/ # Page Object Model classes 
│ │ │ ├── utils/ # Utility methods (waits, screenshots, etc.) 
│ │ │ ├── hooks/ # Cucumber hooks for setup/teardown 
│ │ │ └── runners/ # TestNG/Cucumber runner classes 
│ ├── test/ 
│ │ └── java/ 
│ │ └── stepdefinitions/ # Cucumber step definitions 
├── resources/ 
│ ├── config.properties # Environment and test config 
│ ├── testdata/ # External test data files 
│ └── log4j.properties # Logging configuration 
├── reports/ # Test execution reports 
├── screenshots/ # Captured screenshots on failure 
├── pom.xml # Maven dependencies and build config 
└── README.md # Project documentation

## Tech Stack & Design Patterns

**Languages & Tools:**
- Java
- Selenium WebDriver
- TestNG
- Cucumber
- Maven
- Jenkins
- GitHub

**Design Patterns Implemented:**
- **Page Object Model (POM):** Encapsulates page elements and actions for maintainability.
- **Singleton:** Ensures a single instance of WebDriver across threads.
- **Factory & Abstract Factory:** Manages browser instantiation and driver setup.
- **Template Method:** Standardizes test execution flow with hooks and runners.

These patterns ensure loose coupling, high cohesion, and easy scalability across test modules and environments.

## Key Features

- 🔧 **Modular Architecture:** Clean separation of concerns across config, drivers, pages, and utilities.
- 🌐 **Browser Abstraction:** Easily switch between Chrome, Firefox, Edge, etc., using Factory pattern.
- 🧪 **TestNG & Cucumber Integration:** Supports both BDD and traditional test styles.
- 🧵 **Parallel Execution:** Thread-safe test runs using TestNG and WebDriver management.
- 📊 **Advanced Reporting:** Integrated Extent Reports and Log4j for detailed execution logs.
- 🔁 **Reusable Utilities:** Custom wait strategies, screenshot capture, and data-driven support.
- 🔄 **CI/CD Ready:** Seamless integration with Jenkins and GitHub for automated pipelines.
- 🧹 **Hooks & Cleanup:** Cucumber hooks ensure clean setup and teardown across scenarios.

These features make the framework scalable for teams and adaptable to evolving test needs.
## How to Run Tests

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/FinalMainProject.git
