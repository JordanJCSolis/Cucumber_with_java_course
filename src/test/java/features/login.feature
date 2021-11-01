Feature: Application login

  #Background: 
    #Given a precondition one
    #And a precondition two

  #Scenario: Homepage default login
  #Given user is on landing page
  #When user login into application with username and password
  #Then homepage should be displayed
  #And user accounts should be displayed
  
  @smokeTest @RegressionTest
  Scenario: User1 login success
    Given user is on landing page
    When user login into application with "username1" and "password1"
    Then homepage should be displayed
    And user accounts should be displayed

  @SanityTest
  Scenario: User2 login success
    Given user is on landing page
    When user login into application with "username2" and "password2"
    Then homepage should be displayed
    And user accounts should be displayed

  @RegressionTest
  Scenario: Data tables
    Given user is on landing page
    When user sign up with following details
      | name            | password  | email             | country | phone      |
      | datatable_user1 | password1 | user1@example.com | Mexico  | 5520167895 |
      | datatable_user2 | password2 | user2@example.com | Russia  | 5520167895 |
    Then homepage should be displayed
    And user accounts should be displayed

  @smokeTest
  Scenario Outline: Parameterizing
    Given user is on landing page
    When user login into application with <username> and <password>
    Then homepage should be displayed
    And user accounts should be displayed

    Examples: 
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |
      | user3    | password3 |
