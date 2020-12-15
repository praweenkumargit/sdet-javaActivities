
@activity1_4
Feature: Posting a job using parameterization
  

  @SmokeTest
 Scenario Outline: Using Examples table to post a job
    Given User is on Post Jobs page
    And filled "<email>" and "<job>" and "<description>" and "<url>" and "<companyName>"
    When user has previewed and submitted
    Then validate job listing

Examples:
    | email | job | description | url | companyName |
    | pk2@gmail.com | auditor | xyz | http://www.google.com | ibm |   