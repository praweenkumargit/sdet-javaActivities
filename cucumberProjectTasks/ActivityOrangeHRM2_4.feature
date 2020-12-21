
@activity2_4
Feature: Creating multiple vacancies
  I want to use this template for my feature file



  @tag2
  Scenario Outline: Creating multiple vacancies using data from an Examples table
    Given User is on Recruitment page
    When provide "<jobTitle>" and "<vacancyName>" and "<hiringManager>" in details 
    Then verify creations

    Examples: 
      | jobTitle  | vacancyName | hiringManager  |
      | 1 |     vacanc13 | IBM 02 |
      | 1 |     vacanc14 | IBM 03   |
