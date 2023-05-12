Feature: As a user I want to get product rating

  @TC01-GetProductRatings
  Scenario: I want to get product rating
    Given I set POST api endpoint get product rating
    When I send request body get product rating
    Then I receive valid HTTP response code 200
    And I validate response get product rating
