@regression
Feature: Dashboard Tests
  @smoke @wip
  Scenario: Developers Page Test
    Given The user is on the login page
    When The user enters Solo's credentials
    Then The user should be able to see dashboard page
    When The user clicks on Developers link
    Then The user should be able to see developers' page title