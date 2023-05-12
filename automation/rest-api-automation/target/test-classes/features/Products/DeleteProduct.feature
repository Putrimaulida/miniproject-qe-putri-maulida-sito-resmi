Feature: As a user I want to delete product

  @TC01-DeleteProduct
  Scenario: As user I have be able to delete existing product
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200