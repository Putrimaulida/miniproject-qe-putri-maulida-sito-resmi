Feature: As a user
  i have be able to login
  so that i can buy products

  @Login
  Scenario: as a user I can successful login with valid data
    Given user on login homepage
    When user click widget button
    And user input valid email field
    And user input valid password
    And user click login button
    Then user on the products page