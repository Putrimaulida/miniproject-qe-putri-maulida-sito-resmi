Feature: As a user I want to post register

  @Register @TC01-Positive
  Scenario: As a user I have be able to create register
    Given I set POST api endpoint post register
    When I send request body post register
    Then I receive valid HTTP response code 200 OK
    And I receive validate for register

  @Register @TC02-Negative
  Scenario: As a user I register with a registered email
    Given I set POST api endpoint post register
    When I send request body post register
    Then I receive valid HTTP response code 400 OK
    And I receive validate for register

