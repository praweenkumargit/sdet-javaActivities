
@tag
Feature: Login Test
  Data driven test without Example

  @tag1
  Scenario: Testing Login without Examples
   Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close the Browser

  

