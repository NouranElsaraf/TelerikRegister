best readme file format I will add it in github
Sure! Here’s a polished and comprehensive format for your README.md file that you can use for your GitHub repository:

markdown
# Selenium Java POM Test Automation

A robust test automation suite for automating the steps outlined for the Telerik demo website using Selenium with Java, Page Object Model (POM), Maven, and TestNG.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Tests](#running-the-tests)
- [Test Report](#test-report)
- [Code Overview](#code-overview)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Project Structure

```plaintext
selenium-java-pom
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── DemosPage.java
│   │           ├── AllProductsPage.java
│   │           ├── LoginPage.java
│   │           ├── RegisterFormPage.java
│   └── resources
└── test
    ├── java
    │   └── base
    │       └── BaseTest.java
    └── registerationTest
        └── RegisterationTests
Prerequisites
Ensure you have the following software installed:

Java 17 or later

Maven 3.6.3 or later

firefox or GeckoDriver

Selenium 4.2.1

TestNG 7.4.0
Code Overview
Page Object Model (POM): This design pattern is used to separate the test logic from the web element interactions.

MethodHandles: Contains common methods for interacting with web elements.

DemosPage: Represents the landingpage and its elements.

AllProductsPage: Represents the Kendo UI plan selection page and its elements.

LoginPage: Represents the page which we enter the email address in whether it is already exist account or not and its elements.

RegistrationFormPage: Represents the registration form page and its elements.

BaseTest: Contains setup and teardown methods for tests.

RegisterTests: Contains test methods for automating the steps outlined in the challenge.

DataModel: Represents the data structure used for test data.

LoginForm: Represents the login form data.

RegistrationForm: Represents the registration form data.

ValidCredentials: Contains valid credentials for testing.

ReadDataFromJson: Handles reading test data from JSON files.

ScreenRecorderUtil: Utility for recording test execution.

Configuration:
Configuration properties such as email, first name, last name, and password can be managed in the dataTest.json in data directory.

properties:
"Email": "test1@gmail.com"
  "RegisterForm": {
    "validCredentials": {
      "password": "noTrial897!",
      "firstName": "Nouran",
      "lastName": "Hesham",
      "company": "VOIS",
      "phone": "01012345478",
      "country": "Egypt"
