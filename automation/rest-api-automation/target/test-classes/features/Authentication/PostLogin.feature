Feature: As a user I want to post login

  @Authentication
  @TC01-Login
  Scenario: As a user I have be able to success login
    Given I set POST api endpoint login
    When I send request body post login
    Then I receive valid HTTP response code 200
    And I receive validate for login