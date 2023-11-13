Project name: taf-fix-price
Goal of Automated Testing Framework: UI (User Interface) and API (Application Programming Interface) testing of internet
store.
Application under testing: https://fix-price.by/ - online store in the format «shop fixed price»
Github repository: https://github.com/kutkovictoria/taf-fix-price
---
Technologies:
Programming Language: Java (version 17)
Build system: Maven
Unit Testing Framework: Junit5
API testing library: RestAssured
Automated Testing Framework: Selenium WebDriver
Logging framework: Log4j2
Automation Test Reporting Tool: Allure Report
CD/CI framework: Jenkins
---
Project structure:
Page Object Model is used as a pattern for the current project to avoid code duplication and enhance code reusability.
POs are splitted into 3 packages:

- locators package contains Classes with all locators for the web elements;
- po package contains Classes with methods to perform activity on the web pages: enter data, click buttons, follow
  links, set filters;
- webdriver package contains Singleton Class created using Singleton pattern.
  It is used for all methods related to WebDriver: setup and quit driver,
  the methods to find/click/sendKeys web element using Explicit Wait.
  Testing part has 2 packages:
- api testing contains BaseUrlTest and LoginTest
- ui testing contains main UI tests: LoginTest, SearchTests, DeliveryStoreTest, BaseTest and HomePageTest.

---

