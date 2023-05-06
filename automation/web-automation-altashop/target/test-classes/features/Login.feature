Feature: Login
  As a user I have be able to success login
  so that i can see products page

  @TC01-PositiveLogin
  Scenario: As a user I want to login with valid email dan password
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    Then user on products page

  @TC02-NegativeLogin
  Scenario: As a user I want to login with invalid email then get error message
    Given user on login page
    When user input invalid email
    And user input valid password
    And user click login button
    Then user see error message "record not found"

  @TC03-NegativeLogin
  Scenario: As a user I want to login with invalid password then get error message
    Given user on login page
    When user input valid email
    And user input invalid password
    And user click login button
    Then user see error message "email or password is invalid"

  @TC04-NegativeLogin
  Scenario: As a user I want to login with invalid email and password then get error message
    Given user on login page
    When user input invalid email
    And user input invalid password
    And user click login button
    Then user see error message "record not found"

  @TC05-NegativeLogin
  Scenario: As a user I want to login without input password then get error message
    Given user on login page
    When user input valid email
    And user click login button
    Then user see error message "password is required"

  @TC06-NegativeLogin
  Scenario: As a user I want to login without input email then get error message
    Given user on login page
    When user input valid password
    And user click login button
    Then user see error message "email is required"

  @TC07-NegativeLogin
  Scenario: As a user I want to login without input email and password then get error message
    Given user on login page
    When user click login button
    Then user see error message "email is required"


