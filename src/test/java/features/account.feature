Feature: User account

  @RegressionTest
  Scenario: Customer account
    Given user is on landing page
    When user login into application with "username1" and "password1"
    Then homepage should be displayed
    And user accounts should be displayed
