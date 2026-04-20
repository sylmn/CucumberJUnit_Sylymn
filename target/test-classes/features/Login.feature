@regression
Feature: Login Function

  # for comment - yorum satırı

  #user story = feature
  #test case = scenario
  #test steps = Given, When, Then etc..

  @admin @smoke
  Scenario: Login as Hasan Gezer
    #precondition
    Given The user is on the login page
    #action
    When The user enters Hasan's credentials
    #validation
    Then The user should be able to see dashboard page
  @dev @smoke
  Scenario: Login as solo
    Given The user is on the login page
    When The user enters Solo's credentials
    Then The user should be able to see Solo's name on the dashboard page

    # class task create a scenario for login test with mike
  @qa @db
  Scenario: Login as mike
    Given The user is on the login page
    When The user enters mike's credentials
    Then The user should be able to see mike's name on the dashboard page
  @qa @smoke @db
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to see Rosa's name on the dashboard page

  @admin
  Scenario: Login as Mansimmo
    Given The user is on the login page
    When The user enters Mansimmo's credentials
    Then The user should be able to see Mansimmo's name on the dashboard page
