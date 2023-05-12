Feature: As a user I want get category by id

  @TC01-GetCategoryId
  Scenario: I want to get category by id
    Given I set GET api endpoint get category id
    When I send request body get category id
    Then I receive valid HTTP response code 200
    And I validate response get category id