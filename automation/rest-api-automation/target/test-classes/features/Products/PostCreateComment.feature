Feature: As a user I want to post create comment

  @PostComment
  Scenario: I want to post create comment
    Given user has api endpoint post create comment
    When user input bearer token
    And user send request body post create comment
    Then user receive response code 200
    And user validate response post create comment

  Scenario: I want to post product rating
    Given I set POST api endpoint product rating
    When I send request body post product rating
    Then I receive valid HTTP response code 200
    And I validate response post product rating