- [1. What is BDD?](#1-what-is-bdd)
- [2. What is Cucumber?](#2-what-is-cucumber)
  - [2.1. Difference between Cucumber \& Selenium](#21-difference-between-cucumber--selenium)
- [3. What is Gherkin?](#3-what-is-gherkin)
  - [3.1. Scenarios](#31-scenarios)
    - [3.1.1. Pre-Conditions](#311-pre-conditions)
- [4. Feature and Feature File](#4-feature-and-feature-file)

# 1. What is BDD?

- BDD is one of the development approach involves the usage of common language that enhances **communication** between various **tech** and **non-tech** teams.
  - Tests are more user-focused and based on the system's behavior.
  - In BDD, "Given-When-Then" is the proposed approach for writing test cases.
    - **Given** I am at landing page of Ecommerce application->
    - **When** I searched for product which does not exist
    - **Then** No results message should be displayed

# 2. What is Cucumber?

- Cucumber is a tool/Framework that supports Behaviour-Driven Development(BDD).

## 2.1. Difference between Cucumber & Selenium

- **Selenium** is the tool to design web Automation tests.
- **Cucumber** helps to design Framework for Selenium Automation tests written in BDD standard.

# 3. What is Gherkin?

- It is a Business Readable, Domain Specific Language that lets we describe software's behavior.
  - **Example:** Pop up messaged is displayed when buttons are clicked and errors are gone.
- **Keywords Used in Cucumber:** Scenario, Feature, Feature file, Scenario outline, Step Definition

## 3.1. Scenarios

- In Cucumber Testcases are represented as Scenarios.
- Scenarios contain Steps which are equivalent to test Steps and use the following keywords (Gherkin syntax) to denote them: `Given`, `When`, `Then`, `But`, and `And` (case sensitive).
  - `Given` - Preconditions are mentioned in the Given keyword
  - `When` - The purpose of the When Steps is to describe the user action.
  - `Then` - The purpose of Then Steps is to observe the expected output.
    - The observations should be related to the business value/benefit of our Feature description.
- **Example**
  ```gherkin
    Scenario: Make Minimum Due payment
    Given user is on Pay credit card page
    Then user fills all details and select Minimum amount option
    And User clicks on Pay button
    Then Credit Card confirmation page is displayed
  ```

### 3.1.1. Pre-Conditions

- When we specify a business requirement, sometimes there are multiple **pre-conditions**, user actions, and expected outcomes.
- We are going to add one more Scenario and will use the `And` and `But` keywords:
  - `And` - This is used for statements that are an addition to the previous Steps and represent positive statements.
  - `But` - This is used for statements that are an addition to previous Steps and represent negative statements.

# 4. Feature and Feature File

- **Feature** represents Business requirement.
- Feature File acts as a Test Suite which consists of all Scenarios.
- In Cucumber, **Feature** files contain **Scenarios**.
  - We can simply create feature file with `.feature` extension.
- Scenarios belonging to specific area of Application will be grouped into one Feature file.
- The text that immediately follows the `Feature` keyword, and is in the same line, is the Title of the Feature file.
- Feature file should contain either Scenario or Scenario Outline.
  - The naming conventions for Feature files should be lowercase with `.feature` extension.
- **Example**

  ```gherkin
    Feature: Credit card payment
      In order to test Credit Card Payment functionality
      As a CC user
      I want to complete the payment through online

    Scenario: Make Minimum Due payment
      Given user is on Pay credit card page
      Then user fills all details and select Minimum amount option
      And User clicks on Pay button
      Then Credit Card confirmation page is displayed

    Scenario: Pay Statement Balance
      Given user is on Pay credit card page
      Then user fills all details and select Statement Balance option
      And User clicks on Pay button
      Then Credit Card confirmation page is displayed

    Scenario: Enter another Amount as 0
      Given user is on Pay credit card page
      Then user fills all details and select other Amount and enter 0
      And User clicks on Pay button
      Then Credit Card confirmation page is not displayed
      But error message is displayed
  ```
