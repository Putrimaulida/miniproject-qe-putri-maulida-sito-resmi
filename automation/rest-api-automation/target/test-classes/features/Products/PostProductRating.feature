Feature: As a user I want to post product rating

  @TCO1ProductRating
  Scenario: I want to post product rating
    Given I set POST api endpoint product rating
    When I send request body post product rating
    Then I receive valid HTTP response code 200
    And I validate response post product rating