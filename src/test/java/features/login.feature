Feature: Application login

  Scenario: Homepage default login
  Given user is on landing page
  When user login into application with username and password
  Then homepage should be displayed
  And user accounts should be displayed
