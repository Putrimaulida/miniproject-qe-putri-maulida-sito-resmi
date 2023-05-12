Feature: Cart
  As a user I want to buy a product
  So that I have to check the cart for payment

  @TC01-PositiveCart
  Scenario: As a user I want to add product to the cart
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click buy button
    And user click the cart
    And user click plus button
    Then user can see the number of products increases

  @TC02-PositiveCart
  Scenario: As a user I want to reduce quantity of a product in the cart
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user double click buy button
    And user click the cart
    And user click min button
    Then user success reduce quantity product

  @TC03-NegativeCart
  Scenario: As a user I can not see number products my cart
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user can not see the number of products in the cart symbol
    And user click the cart
    Then user can see alert "Order is empty!"

  @TC04-PositiveCart
  Scenario: As a user I want to pay the product
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    And user on products page
    And user click buy button
    And user click the cart
    And user click button Bayar
    Then user can see transaction page


