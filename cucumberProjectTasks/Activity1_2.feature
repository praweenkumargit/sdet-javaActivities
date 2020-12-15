@activity1_2
Feature: Searching for jobs using XPath

@SmokeTest
Scenario: Searching for jobs and applying to them using XPath
    Given User is on Jobs Page
    When Find the suitable job
    Then Apply for the job
    And close the browser
    
 