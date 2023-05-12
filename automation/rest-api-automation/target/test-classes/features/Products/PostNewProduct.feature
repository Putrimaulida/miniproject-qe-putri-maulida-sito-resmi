Feature: As a user I have be able to create new product

  @TC02-PostNewProduct
  Scenario: I want to post a new product
    Given I set POST api endpoint
    When I send POST HTTP request body
    Then I receive valid HTTP response code 200
    And I receive valid data for new user