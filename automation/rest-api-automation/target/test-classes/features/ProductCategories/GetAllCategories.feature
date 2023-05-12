Feature: As a user I want get all categories

  @TC01-GetAllCategories
  Scenario: I want to get all categories
    Given I set GET api endpoint get all categories
    When I send request body get all categories
    Then I receive valid HTTP response code 200
    And I validate response get all categories