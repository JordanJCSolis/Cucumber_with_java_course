Feature: Application login

  #Scenario: Homepage default login
    #Given user is on landing page
    #When user login into application with username and password
    #Then homepage should be displayed
    #And user accounts should be displayed

  Scenario: User1 login success
    Given user is on landing page
    When user login into application with "username1" and "password1"
    Then homepage should be displayed
    And user accounts should be displayed

  Scenario: User2 login success
    Given user is on landing page
    When user login into application with "username2" and "password2"
    Then homepage should be displayed
    And user accounts should be displayed
