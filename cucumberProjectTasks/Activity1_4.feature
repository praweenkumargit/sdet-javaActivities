
@activity1_3
Feature: Posting a job using parameterization
  I want to use this template for my feature file

  @tag1
  Scenario: Post a job using details passed from the Feature file
   Given User is on Post Jobs page
    And filled "email" and "job" and "description" and "url" and "companyName"
    When user has previewed and submitted
    Then validate job listing
