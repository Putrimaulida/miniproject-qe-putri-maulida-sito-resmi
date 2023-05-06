Feature: Register
  As a user I want to login
  So that I have to register account

  @TC01-Register
  Scenario: As a user I want to register with valid data
    Given user on login homepage
    When user click register
    And user input full name
    And user input email
    And user input password
    And user click register button
    Then user see login homepage


  @TC02-Register
  Scenario: As a user I register with a registered email
    Given user on login homepage
    When user click register
    And user input full name
    And user input email
    And user input password
    And user click register button
    Then user can see error message