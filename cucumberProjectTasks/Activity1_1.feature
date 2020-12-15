@activity1_1
Feature: Create a new user

@SmokeTest
Scenario: Visit the site’s backend and create a new user
    Given User is on Users Page
    When Complete the details and submit
    Then Verify User created
    And Close the browser