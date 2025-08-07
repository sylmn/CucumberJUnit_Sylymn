Feature: Login Function

  # for comment - yorum satırı

  #user story = feature
  #test case = scenario
  #test steps = Given, When, Then etc..


  Scenario: Login as Hasan Gezer
    Given The user is on the login page
    When The user enters Hasan's credentials
    Then The user should be able to see dashboard page

  Scenario: Login as Leroy
    Given The user is on the login page
    When The user enters Leroy's credentials
    Then The user should be able to see dashboard page

    # class task create a scenario for login test with mike

  Scenario: Login as mike
    Given The user is on the login page
    When The user enters mike's credentials
    Then The user should be able to see dashboard page
