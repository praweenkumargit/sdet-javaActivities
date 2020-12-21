
@activity3_4
Feature: Creating a Product.
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
     Given I am on homepage
    When Provide "<name>" and "<price>" in products
    Then verify creation of products
    Examples: 
      | name  | price |
      | bhokal |     5 |
      | munna |     7 |