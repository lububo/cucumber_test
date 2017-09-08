Feature: Login Feature
  This feauter deals with Login functionality

  Scenario: Login with correc username and password
    Given I navigate to login page
    And I enter the username as "admin" and password as "admin"
    And I click login button
    Then i should see userform page



