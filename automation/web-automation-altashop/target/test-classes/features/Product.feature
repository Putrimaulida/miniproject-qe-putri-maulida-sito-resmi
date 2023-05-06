Feature: Product
  As a user I want to select a product
  So that I can buy the product

  @TC01-PositiveSelectProduct
  Scenario: As a user I want to select some product in my cart
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click buy button
    Then user success to add product to cart

  @TC02-PositiveDetailProduct
  Scenario: As a user I want to see detail product
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click detail button
    Then user can see detail products

  @TC03-PositiveProductRating
  Scenario: As a user I want to give rating product
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click detail button
    And user fills on product rating
    Then user successfully product rating

  @TC04-PositiveSelectCategory
  Scenario: As a user I want to search for products by select category
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click dropdown select category
    And user click one of the categories
    Then user can see message "Products is empty!"


