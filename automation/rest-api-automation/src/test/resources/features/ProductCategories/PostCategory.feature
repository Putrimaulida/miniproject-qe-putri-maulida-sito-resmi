Feature: As a user I want post create a category

  @TC01-PostCategory
  Scenario: I want to post create a category
    Given I set POST api endpoint create category
    When I send request body create category
    Then I receive valid HTTP response code 200
    And I validate response create category