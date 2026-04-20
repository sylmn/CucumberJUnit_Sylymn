# # Cucumber JUnit Selenium Test Automation Project
This project is a **Test Automation Framework** built using **Java, Selenium, Cucumber (BDD), JUnit, and Maven**.
It demonstrates automated UI testing with **data-driven testing (Excel integration)**.

## Technologies Used
* Java
* Selenium WebDriver
* Cucumber (BDD - Gherkin)
* JUnit
* Maven
* Apache POI (Excel handling)

## Project Structure
```
src
 └── test
     ├── java
     │    ├── stepdefinitions
     │    ├── runners
     │    ├── pages
     │    └── utils
     │
     └── resources
          ├── features
          ├── testdata (Excel files)
          └── config
```

## Features

* BDD approach with Gherkin syntax
* Page Object Model (POM) design
* Data-driven testing using Excel
* Scenario Outline support
* Reusable step definitions
* Maven build and execution

## Test Scenario Example
```gherkin
Scenario Outline: Login Test
  Given The user is on the login page
  When The user logins with using excel file: "<path>" and "<sheetName>" and <row>
  Then The user verifies success login

Examples:
  | path                              | sheetName | row |
  | src/test/resources/LoginList.xlsx | QaTeam1   | 1   |
```

## How to Run Tests
### Using IntelliJ
* Open the project
* Run the **Cucumber Runner class**
### Using Maven
```bash
mvn clean test
```

## Key Highlights
* Excel-based login testing (dynamic data input)
* Multiple scenario executions via Scenario Outline
* Clean separation of test logic and test data
* Scalable structure for real-world QA automation

## Future Improvements
* Parallel test execution
* CI/CD integration (Jenkins/GitHub Actions)
* Advanced reporting (Extent Reports / Allure)
* API test integration

## Author
**Syuleyman**
QA Engineer | Test Automation

## Repository
https://github.com/sylmn/CucumberJUnit_Sylymn.git

