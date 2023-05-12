Feature: As a user I want to get all product

  @Products
  @TC01-GetProductById
  Scenario:  As a user I have be able to get product by id
    Given I set GET id endpoint
    When I send GET id request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

