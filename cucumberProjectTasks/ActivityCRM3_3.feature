
@activity3_3
Feature: Schedule a meeting and invite members
  I want to use this template for my feature file

 
  @tag2
  Scenario Outline: To schedule a meeting and include at least 3 invitees
    Given I am on homepage
    When Provide the "<name>" in create Meetings
    Then verify creation of "<name>" meetings

    Examples: 
      | name  | 
      | name1 | 
      | name2 | 
