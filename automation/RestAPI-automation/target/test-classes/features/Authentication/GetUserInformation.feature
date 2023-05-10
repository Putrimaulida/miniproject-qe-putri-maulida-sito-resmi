Feature: As a user I want to get user information

  @GetUserInformation
  Scenario: I want to get user information
    Given I set api endpoint auth
    And I send endpoint auth
    When I set api endpoint get user information
    And I send HTTP request
    Then I receive response code 200
    And I validate response body get user information
