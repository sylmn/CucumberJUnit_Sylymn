Feature: Login Function
# for comment - yorum satiri isareti
  #user story = feature
  #test case = scenario
  #test steps = Given, When, Then etc...

  Scenario: Login as Solo
    Given The user is on the login page
    When The user enters Solo's credentials
    Then The user should be able to see dashboard page

  Scenario: Login as User11
    Given The user is on the login page
    When The user enters User11's credentials
    Then The user should be able to see dashboard page

# class task create a scenario for login test with mike
  Scenario: Login as mike
    Given The user is on the login page
    When The user enters mike's credentials
    Then The user should be able to see dashboard page