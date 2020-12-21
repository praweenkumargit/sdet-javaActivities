
@activity2_3
Feature: Add multiple employees
  I want to use this template for my feature file



  @tag2
  Scenario Outline: Add multiple employees using an the Examples table
    Given I am on Employees page
    When I provide "<name>" and "<name2>" and "<name3>" in details
    Then I verify creation

    Examples: 
      | name  | name2 | name3  |
      | pk2 |     ku | pkkum2 |
      | pk2 |     ku | pkku3  |
